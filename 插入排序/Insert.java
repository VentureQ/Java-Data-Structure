package 插入排序;

/**
 * 插入排序（英语：Insertion Sort）是一种简单直观的排序算法。
 * 它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，
 * 找到相应位置并插入。插入排序在实现上，在从后向前扫描过程中，
 * 需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。
 * https://blog.csdn.net/qq_28081081/article/details/80594386
 */

public class Insert
{
    public static void main(String[] args)
    {
        int[] ins = {2,3,5,1,23,6,78,34};
        int[] ins2 = sort(ins);
        for(int in: ins2){
            System.out.print(in+" ");
        }
    }

    public static int[] sort(int[] ins){

        for(int i=1; i<ins.length; i++){
            for(int j=i; j>0; j--){
                if(ins[j]>ins[j-1]){
                    int temp = ins[j-1];
                    ins[j-1] = ins[j];
                    ins[j] = temp;
                }
            }
        }
        return ins;
    }
}