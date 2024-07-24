import java.util.LinkedList;

public class classroom {
    public static void main(String[] args) {
        //create - objects 
        LinkedList<Integer> ll =new LinkedList<>();

        //add
        ll.addFirst(1);
        ll.addLast(2);
        ll.add(0);

        System.err.println(ll);

        //remove
        ll.removeLast();
        ll.removeFirst();
    }
}
