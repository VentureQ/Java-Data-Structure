package 插入排序;

public class Insert_优化 {
    public static void main(String[] args) {
        int[] ins = {2, 3, 5, 1, 23, 6, 78, 34};
        int[] ins2 = sort3(ins);
        for (int in : ins2) {
            System.out.print(in+" ");
        }

    }

    public static int[] sort2(int[] ins){

        for(int i=1; i<ins.length; i++){
            int temp = ins[i];//保存每次需要插入的那个数
            int j;
            for(j=i; j>0&&ins[j-1]>temp; j--){//这个较上面有一定的优化
                ins[j] = ins[j-1];//吧大于需要插入的数往后移动。最后不大于temp的数就空出来j
            }
            ins[j] = temp;//将需要插入的数放入这个位置
        }
        return ins;
    }

    //Offer来了代码
    public static int[] sort3(int []arr){
        for(int i=1;i<arr.length-1;i++){
            int insertVal=arr[i];//插入的数
            int index=i-1;
            while(index>=0&&insertVal<arr[index]){
                //如果待插入的数小的话就将前面的数向后移动
                arr[index+1]=arr[index];
                index--;//将index向前移动
            }
            arr[index+1]=insertVal;
        }
        return arr;
    }

    //快速排序
    public static int[] sort4(int []arr,int low,int high){
        int start=low;
        int end=high;
        int key=arr[low];
        while (end>start){
            while(end>start&&arr[end]>=key){
                end--;
            }
            if(arr[end]<key){
                int temp=arr[end];
                arr[end]=arr[start];
                arr[start]=temp;
            }
            while(end>start&&arr[start]<=key) {
                start++;
            }
            if(arr[start]>key) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end]= temp;
            }

        }
        if(start>low) sort4(arr,low,start-1);
        if(end<high) sort4(arr,end+1,high);
        return arr;
    }


}
