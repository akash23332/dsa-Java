package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;


class Quad{
    int sum;
    int max;
    int min;
    int size;
    Quad(int sum,int max,int min,int size){
        this.max=max;
        this.min=min;
        this.size=size;
        this.sum=sum;
    }
}

class Node {
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }

}
class Pair {
    Node node;
    int level;
    Pair(Node node ,int level) {
        this.node = node;
        this.level = level;
    }
}
public class Implementation {
    private static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    private static int Size(Node root){
        if(root==null) return 0;
        int leftSize=Size(root.left);
        int rightSize=Size(root.right);
        return 1+leftSize+rightSize;
    }
    private  static  int sum(Node root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    private static  int product(Node root){
        if(root==null) return 1;
        return root.val*product(root.left)*product(root.right);
    }
    private static  int productofNonZero(Node root){
        if(root==null) return 1;
        if (root.val == 0) {
            return productofNonZero(root.left) * productofNonZero(root.right);
        }
        return root.val*productofNonZero(root.left) * productofNonZero(root.right);
    }
    private static  int max(Node root){
        if(root==null) return Integer.MIN_VALUE;

        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }
    private static int levels(Node root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public static  void levelOrder(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            Node front=q.remove();
            System.out.print(front.val+" ");

            if(front.left!=null)q.add(front.left);
            if(front.right!=null)q.add(front.right);

        }
        System.out.println();
    }
    public static void levelOrderLinewise(Node root){
        Queue<Pair> q=new LinkedList<>();
        int currlevel=0;
        q.add(new Pair(root,0));
        while(q.size()>0){
            Pair front=q.remove();
            if(front.level!=currlevel){
                currlevel++;
                System.out.println();
            }
            System.out.print(front.node.val+" ");

            if(front.node.left!=null) q.add(new Pair(front.node.left,front.level+1));
            if(front.node.right!=null) q.add(new Pair(front.node.right,front.level+1));

        }
        System.out.println();

    }
    public static void levelterm(Node root,int level,int k){
        if(root==null) return;
        if(level==k) System.out.println(root.val);
        levelterm(root.left,level+1,k);
        levelterm(root.right,level+1,k);
    }


    public static Quad all(Node root){
        if(root==null) return new Quad(0,Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        Quad lst=all(root.left);
        Quad rst=all(root.right);
        int max=Math.max(root.val,Math.max(lst.max,rst.max));
        int min=Math.min(root.val,Math.min(lst.min,rst.min));
        int size=1+lst.size+rst.size;
        int sum=root.val+rst.sum+lst.sum;
        return new Quad(sum, max, min, size);


    }
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(4);
        Node c=new Node(2);
        Node d=new Node(-1);
        Node e=new Node(1);
        Node f=new Node(6);
        Node g=new Node(9);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
//        display(a);
//        System.out.println();
//        System.out.println(Size(a));
//        System.out.println(sum(a));
//        System.out.println(product(a));
//        levelOrder(a);
//        levelOrderLinewise(a);
        levelterm(a,0,2);
    }


    private static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    private static void postOrder(Node root){
        if(root==null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    private static void inOrder(Node root){
        if(root==null) return;

        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
}
