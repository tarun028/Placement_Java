public class Linkedlist {

    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    static int size;

    public void addFirst(int data){

        //s1 - create new node
        Node newNode = new Node(data);

        size++;
        
        if(head==null){
            head = tail = newNode;
            return;
        }

        //s2 - newNode next = head
        newNode.next=head; //link

        //s3 - head - new node
        head=newNode;
    }
    public void addLast(int data){
         Node newNode = new Node(data);

        size++;

         if(head==null){
            head=tail=newNode;
            return;
         }

         tail.next=newNode;
         tail=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp =head;
        int i=0;

        while(i<idx-1){
            temp=temp.next;
            i++;
        }

        //i = idx-1 ; temp -> prev
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.err.println("empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head=head.next;
        size--;
        return val;
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addFirst(2);
        //ll.print();
        ll.addFirst(1);
        //ll.print();
        ll.addLast(3);
        //ll.print();
        ll.addLast(4);
        ll.add(2, 9);
        ll.print();
        System.err.println(ll.size);
        ll.removeFirst();
        ll.print();
    }
}
