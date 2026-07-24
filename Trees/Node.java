package Trees;

public class Node {
    int data;
    Node left;
    Node right;
    public Node(int data){
    this.data=data;
    }
    public static void main(String[] args){
    Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.right=new Node(5);
    //print
    System.out.println(root.data);
System.out.println(root.left.data);
System.out.println(root.right.data);
System.out.println(root.left.right.data);
    }
}
