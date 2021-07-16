package 快速排序;

public class QuickSort {

    public static int [] quickSort(int []arr,int low,int high){
        int start=low;
        int end=high;
        int key=arr[low];

        while(end>start){
            while(end>start&&arr[end]>=key) end--;
            if(arr[end]<=key){
                int temp=arr[end];
                arr[end]=arr[start];
                arr[start]=temp;
            }
            while(end>start&&arr[start]<=key) start++;
            if(arr[start]>=key){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
        }
        if(start>low) quickSort(arr,low,start-1);
        if(end<high) quickSort(arr,end+1,high);


        return arr;
    }

    public static void main(String[] args) {
        int [] array=new int[]{6,4,54,3,7,8,7,2,12,32};

        quickSort(array,0,array.length-1);
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }


}
