package Strategy;

public class Sorter {

    public void sort(int []arr){
        for (int i=0;i<arr.length-1;i++) {
            int  minPos=i;
            for (int j = i+1; j < arr.length; j++) {
                minPos=arr[j]<arr[minPos]?j:minPos;
            }
            int tmp=arr[i];
            arr[i]=arr[minPos];
            arr[minPos]=tmp;
        }
    }
}
