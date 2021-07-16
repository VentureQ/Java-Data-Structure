package 二叉搜索树;


public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(){

    }

    public Node(Node left, Node right,int value) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }



    public void insertBST(int key){
//        practice.Node p=root;

    }






    public static void main(String[] args) {
        int a=9;
        int b=6;
        System.out.println(a+b+",");

        int [][]array=new int [4][5];
        System.out.println(array.length);
        System.out.println(array[1].length);
        System.out.println(1+"10"+3+"2");
    }
}
