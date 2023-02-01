public class linklist_basic {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    void Addfirst(int data){
        Node newnode =new Node(data);
        if (head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
       head=newnode;
    }
    public void Addlast(int data){
        Node newnode = new Node(data);
        if (head==null){
            head=newnode;
            return;
        }
        Node curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        //1234
        curr.next = newnode;

    }
    void deletefirst(){

        if (head==null){
            System.out.println("empty");
        }
        if (head.next==null){
            head=null;
        }
        head=head.next;
    }
    void deletelast(){

        if (head==null){
            System.out.println("empty");
        }
        if (head.next==null){
            head=null;
        }
        Node curr =head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr=null;
    }

    public void printlist(){

        if (head==null){

            System.out.println("ll is empty");
        }
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data +" -->");
            curr=curr.next;
        }
        //1234
        System.out.println("null");

    }
    public void Reverse_Linked_List(){
        Node current=head;
        Node pre =null;
        while (current!=null){
            Node temp = current.next;
            current.next=pre;
            pre=current;
            current=temp;
        }
    }

    public static void main(String[] args) {
        linklist_basic obj =new linklist_basic();
        obj.Addlast(1);
        obj.Addlast(2);
        obj.Addlast(3);
        obj.Addlast(4);
        obj.printlist();
        obj.deletelast();
        obj.printlist();
    }

}
