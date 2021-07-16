package 冒泡排序;

public class BubbleSort {
    public static int [] bubbleSort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }

    public static void swap(int array[],int a,int b){
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }

    public static void main(String[] args) {
        int arr[]=new int[]{1,52,13,24,5,66,7,8,9,10};
        for(int i:bubbleSort(arr)){
            System.out.print(i+" ");
        }
    }

}
