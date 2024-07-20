import java.util.*;
public class hashmapstart {
    public static void main(String[] args) {
        //create - country(key) , population(value)
        HashMap<String,Integer> map = new HashMap<>();

        //insert

        map.put("India", 120);
        map.put("pakistan", 20);
        map.put("China", 110);

        System.err.println(map);

        map.put("china", 10);
        System.out.println(map);

        //search
        if(map.containsKey("china")){
            System.err.println("present");
        }
        else{
            System.out.println("no");
        }

        System.out.println(map.get("china"));
        System.out.println(map.get("indonesia"));

        for(Map.Entry<String,Integer>e: map.entrySet()){
            System.err.println(e.getKey());
            System.out.println(e.getValue());
        }

        map.remove("india");
        System.out.println(map);

    }
}
