import java.util.HashSet;
import java.util.Iterator;
 
public class hashsetstart {
    public static void main(String[] args) {
        //creating
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);//list.add(el)
        
        //size
        System.out.println("size is = "+set.size());
        System.out.println(set);

        //search - contain
        if(set.contains(1)){
            System.out.println("set have 1");
        }
        if(!set.contains(9)){
            System.out.println("no 9");
        }

        //remove
        set.remove(1);


        if(!set.contains(1)){
            System.out.println("no 1");
        }

        //iterator - its like i in loops
        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    } 
}
