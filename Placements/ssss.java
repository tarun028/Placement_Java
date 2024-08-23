import java.util.*;
public class ssss {

    public static String lcp(String[] s){
        if(s==null || s.length==0){
            return " ";
        }

        //first element of string
        String prefix=s[0];

        //check 
        for(int i=1;i<s.length;i++){
            while(s[i].indexOf(prefix)!=0){

                //reduce
                prefix=prefix.substring(0, prefix.length()-1);

                if(prefix.isEmpty()) return " ";
            }
        }
        return prefix;
    }

    public static boolean isAnagram(String s,String t){
        if(s.length()!=t.length()) return false;

        char[] a=s.toCharArray();
        char[] b=t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);

    }

    public static List<List<String>> groupAnagrams(String[] str){
        Map<String,List<String>> list = new HashMap<>();

        for(String c : str){
            //convert to arrays
            //this c is like a object for str

            char[] charArray = c.toCharArray();
            Arrays.sort(charArray);
            String newS=new String(charArray);

            if(!list.containsKey(newS)){
                list.put(newS,new ArrayList<>());
            }
            list.get(newS).add(c);


        }
        return new ArrayList<>(list.values());

    }

    public static char firstNonRepeatingChar(String str){

        // for(int i=0;i<str.length();i++){
        //     char check=str.charAt(i);

        //     //check 
        //     if(str.indexOf(check)==str.lastIndexOf(check)){
        //         return check;
        //     }
        // }
        // return '\0';
        int n =str.length();


        for(int i=0;i<n;i++){
            char check = str.charAt(i);
            boolean flag=false;
            for(int j=0;j<n;j++){
                if(i!=j && str.charAt(j)==check){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                return check;
            }
            


        }
        return '\0';
    }

    public static void NextGreater(int box[]){
        int n=box.length;


    }

    public static int[] conseSum(int arr[]){
        if(arr.length<2) {
            return new int[0];
        }

        int res[]= new int[arr.length-1];

        for(int i=0;i<arr.length;i++){
            res[i]=arr[i+1]-arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        //System.out.println("Longest Common Prefix: " + lcp(strs));

        String s = "listen";
        String t = "silent";

        //System.out.println("Are the strings anagrams? " + isAnagram(s, t));

        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        //List<List<String>> result = groupAnagrams(str);
        //System.out.println(result);

        String str1 = "swiss";
        char r = firstNonRepeatingChar(str1);
        System.out.println(r);
    
    }
}
