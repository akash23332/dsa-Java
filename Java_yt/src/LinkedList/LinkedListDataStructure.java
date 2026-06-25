package LinkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }}
class LinkedList{
     Node head;
     Node tail;
     void addAtTail(int val){
         Node temp=new Node(val);
         if(tail==null) head=tail=temp;
        else {
             tail.next=temp;
             tail=temp;
         }

     }
     void AddAtHead(int val){
         Node temp=new Node(val);
         if(head==null){
             head=tail=temp;
         }
         else{
             temp.next=head;
             head=temp;
         }

    }
     void display(){
         if(head==null){
             return;
         }
         Node temp=head;
         while (temp!=null){
             System.out.println(temp.val+" ");
             temp=temp.next;
         }
         System.out.println();
     }
}
public class LinkedListDataStructure {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addAtTail(10);
        ll.AddAtHead(20);
        ll.display();
    }

}
