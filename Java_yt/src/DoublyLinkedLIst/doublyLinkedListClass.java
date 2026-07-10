package DoublyLinkedLIst;


class dnode{
    int val;
    dnode next;
    dnode prev;
    dnode(int val){
        this.val=val;
    }
}
class Dll{
    dnode head;
    dnode tail;
    int size;
    void insertAtHead(int val){
        dnode temp=new dnode(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        size++;

    }
    void insertAtTail(int val){
        dnode temp=new dnode(val);
        if(tail==null) head=tail=temp;
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;
    }

    void deleteAthead(){
        if(size==0){ System.out.println("List is empty");
        return;}

        if(size==1) head=tail=null;

        else{
            head=head.next;
            head.prev=null;
        }

       size--;
    }


    void deleteAtTail(){
        if(size==0) {System.out.println("List is empty");
        return;}

        if(size==1) head=tail=null;


        else{
           tail=tail.prev;
           tail.next=null;
        }

        size--;
    }
    void display(){
        dnode temp=head;
        while(temp!=null){
            System.out.println(temp.val+" ");
            temp=temp.next;
        }
    }
    void displayReverse(){
        dnode temp=tail;
        while(temp!=null){
            System.out.println(temp.val+" ");
            temp=temp.prev;
        }
    }
    void insert(int idx,int val){

        if(idx<0 || idx>size){
            System.out.println("invalid idx");
            return;
        }
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtTail(val);
            return;
        }
        dnode temp=head;
        dnode newnode=new dnode(val);
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        newnode.prev=temp;
        newnode.next=temp.next;
        temp.next=newnode;
        temp.next.prev=newnode;


    }
    void deleteAtIndex(int idx){

        if(idx<0 || idx>=size){
            System.out.println("invalid idx");
        }
        if(idx==0){
            deleteAthead();
            return;
        }
        if (idx==size){
            deleteAtTail();
            return;
        }
        dnode temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        dnode del = temp.next;

        temp.next = del.next;
        del.next.prev = temp;

        size--;
    }

}
public class doublyLinkedListClass {
    public static void main(String[] args) {
        Dll list=new Dll();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtTail(30);
        list.insert(1,40);
        list.deleteAtIndex(2);
        list.display();
//        list.displayReverse();
    }

}
