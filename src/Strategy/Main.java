package Strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int []a={9,2,3,5,7,1,4};
        Dog[] a={new Dog(3),new Dog(5),new Dog(1)};
        Sorter<Dog> sorter=new Sorter<>();
        sorter.sort(a,(o1,o2)->{
            if (o1.food<o2.food)return -1;
            else if (o1.food>o2.food)return 1;
            else return 0;
        });
        System.out.println(Arrays.toString(a));
    }
}
