package Strategy;

public class Cat {
    int weight,height;
    public Cat(int weight,int height){
        this.weight=weight;
        this.height=height;
    }
    public int compareTo(Cat c){
        if(this.weight<c.weight)return -1;
        else if(this.weight>c.weight)return 1;
        else return 0;
    }
}
