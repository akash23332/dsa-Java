package LinkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class LinkedList{
     Node head;
     Node tail;
     int size;
     void addAtTail(int val){
         Node temp=new Node(val);
         if(tail==null) head=tail=temp;
        else {
             tail.next=temp;
             tail=temp;
         }
        size++;

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
         size++;

    }
    void DeleteAtHead(){
         if (head==null){
             System.out.println("List is empty");
             return;
         }

         head=head.next;
         if(head==null){
             tail=null;
         }
         size--;
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
     boolean search(int val){
         if(head==null) return false;
         Node temp=head;
         while(temp!=null){
             if(temp.val==val){ return true;}
             temp=temp.next;
         }
         return false;
     }
     void insert(int idx,int val){
         if(idx<0 || idx>size){
             System.out.println("Invalid idx");
             return;
         }
         if(idx==0) AddAtHead(val);
         else if(idx==size) addAtTail(val);
         else {
             Node temp = head;


             for (int i = 1; i <= idx; i++) {
                 temp = temp.next;

             }
             Node t = new Node(val);
             t.next = temp.next;
             temp.next = t;
             size++;
         }


     }
     void delete(int idx){
         if(idx<0 || idx>=size){
             System.out.println("Invalid idx");
             return;
         }
         if(idx==0) DeleteAtHead();

         Node temp=head;
         for(int i=1;i<=idx-1;i++){
             temp=temp.next;
         }
         temp.next=temp.next.next;
         if(idx==size-1) tail=temp;
         size--;

     }


}
public class LinkedListDataStructure {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addAtTail(10);
        ll.AddAtHead(20);
        ll.display();
        ll.DeleteAtHead();
        ll.display();
    }

}
