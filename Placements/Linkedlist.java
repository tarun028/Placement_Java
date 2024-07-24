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
            System.out.println(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println(" ");
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

    public int removeLast(){
        if(size==0){
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev : i=size-2
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }

        int val = prev.next.data; //tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val; 

    }

    public int itrSearch(int key){
        Node temp = head;
        int i=0;

        while(temp!=null){
            if(temp.data==key){//found
                return i;
            }
            temp=temp.next;
            i++;
        }
        //not found
        return -1;
    }

    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }

        if(head.data==key){
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){
        return helper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next ;
        
        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n){
        //calculate size phise se
        int sz=0;
        Node temp = head;

        while(temp!=null){
            temp=temp.next;
            sz++;
        }

        if(n==sz){
            head=head.next;
            return;
        }

        //sz-n
        int i =1;
        int iToFind = sz-n;
        Node prev = head;

        while(i<iToFind){
            prev=prev.next;
            i++;
        }

        prev.next=prev.next.next;
        return;
    }

    //slow- fast
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null || fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean checkPalimdrome(){
        if(head==null || head.next!=null){
            return true;
        }
        //step 1 - find mid
        Node minNode = findMid(head);

        //step2 - reverse 2nd half
        Node prev = null;
        Node curr =  minNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right = prev; //right half head
        Node left = head;  //left half head

        //step 3- check if equals

        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left =left.next;
            right=right.next;
        }

        return true;


    }

    public boolean isCycle(){
        Node slow= head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        //detect cycle 
        Node slow = head;
        Node fast = head;

        //find meeting point

        //remove cycle -> last.next = null
    }
 


    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        //ll.addFirst(2);
        //ll.print();
        //ll.addFirst(1);
        //ll.print();
        //ll.addLast(2);
        //ll.print();
        //ll.addLast(1);
        //ll.add(2, 9);
        //ll.print();
        // System.err.println(ll.size);
        //ll.removeFirst();
        // System.err.println(ll.size);
        // //ll.removeLast();
        // System.err.println(ll.size);
        //ll.print();
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.itrSearch(8));
        // ll.print();
        // //ll.reverse();
        // ll.deleteNthfromEnd(3);
        // ll.print();
    }
}
