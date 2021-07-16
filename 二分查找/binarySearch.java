package 二分查找;

public class binarySearch {
    public static int binarySearch(int []array,int a){
        int low=0;
        int high=array.length-1;
        int middle;
        while(low<high){
            middle=(high-low)/2+low;
            if(array[middle]==a){
                return middle;
            }else if(array[middle]>a){
                high=middle-1;
            }else{
                low=middle+1;
            }
        }
        return -1;
    }


    public static void Swap(int array[],int a,int b){
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }

    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr,11));

    }
}
