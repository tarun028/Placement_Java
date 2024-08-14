import java.util.*;
public class hashhash {
    public static void main(String[] args) {
        //country = key , population = value
        HashMap<String,Integer> map=new HashMap<>();

        //insertion

        map.put("India",120);
        map.put("china",30);
        map.put("US", 150);

        //System.out.println(map);

        map.put("china", 130);

        //search

        if(map.containsKey("china")){
            //System.out.println("yes");
        }
        else{
            System.out.println("not present");
        } 

        //System.out.println(map.get("china"));
        //System.err.println(map.get("indo"));

        int arr[]={1,2,3};
        for(int val:arr){
            System.out.println(val+" ");
        }

        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        map.remove("china");
        System.out.println(map);
    }
}
