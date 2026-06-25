//package LinkedList;
//
//class Node{
//    int val;
//    Node next;
//    Node(int val){
//        this.val=val;
//    }}
//public class DisplayList {
//    public static void displayRec(Node head) {
//        if (head == null) return;
//        System.out.println(head.val + " ");
//        display(head.next);
//    }
//
//    public static void display(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.println(temp.val + " ");
//            temp = temp.next;
//
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        Node a = new Node(10);
//        Node b = new Node(20);
//        Node c = new Node(30);
//        Node d = new Node(40);
//        Node e = new Node(50);
//
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
//        e.next = null;
/// /        display(a);
//        System.out.println(get(a,2));
//    }
//
//
//    private static int get(Node head, int idx) {
//        Node temp = head;
//        for(int i=1;i<=idx;i++){
//            temp=temp.next;
//        }
//        return temp.val;
//    }
//
//}
//
