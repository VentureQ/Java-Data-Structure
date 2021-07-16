package 堆排序;


/**
 * 数组的节点的索引为index，则：
 *
 * 1)它的父节点的下标为：(index-1)/2
 *
 * 2)它的左子节点的下表为：2*index + 1
 *
 * 3)它的左子节点的下表为：2*index + 2
 *
 * 2、堆与二叉搜索树的不同：
 * 堆和二叉搜索树相比是弱序的。在二叉搜索树中，所有节点的关键字大于其左子树的关键字，
 * 小于其右子树的关键字。但是在堆中，每个节点都不小于其子节点，即从 根到叶子节点的每条路径都是降序排列的。
 * https://blog.csdn.net/qq_36186690/article/details/82505569
 */

public class insert_堆排序 {
    static int a=9/2-1;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(function(4));
        int temp=0;
        for (int i = 1; i <= 2; i++) {
            temp=temp+function(i);
        }
        System.out.println(temp);

    }
    private static int function(int a){
        if(a<=1){
            return 1;
        }
        return a*function(a-1);

    }


}
