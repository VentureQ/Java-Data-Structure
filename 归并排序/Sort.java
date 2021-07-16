package 归并排序;

public class Sort {


    public static int []mergeSort(int [] data){
        sort(data,0,data.length-1);

        return data;
    }


    //递归排序左右数组，相当于对数组进行分解
    public static void sort(int[] data,int left,int right){
        if(left>=right) return;
        int midd=(right+left)/2;
        sort(data,left,midd);
        sort(data,midd+1,right);
        //Merge合并
        merge(data,left,midd,right);
    }


    //相当于对数组进行排序合并
    public static void merge(int [] data,int left,int center,int right){
        int temp[]=new int[data.length];
        int midd=center+1;
        int third=left;
        int tmp=left;//临时数组的左索引，用来将临时数组复制到原数组中
        while(left<=center&&midd<=right){
            if(data[left]<data[midd]){
                temp[third++]=data[left++];
            }else{
                temp[third++]=data[midd++];
            }
        }
        while(left<=center){
            temp[third++]=data[left++];
        }
        while(midd<=right){
            temp[third++]=data[midd++];
        }

        //将临时数组元素复制到原数组
        while(tmp<=right){
            data[tmp]=temp[tmp++];
        }
    }


    //测试
    public static void main(String[] args){
        int[] ins = {2, 3, 5, 1, 23, 6, 78, 34};
        mergeSort(ins);
        for (int in : ins) {
            System.out.print(in + " ");

        }
    }

}
