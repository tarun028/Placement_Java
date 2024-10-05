import java.util.*;
public class numberSystem {
    public static boolean primeNo(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
        
    }
    public static double gpSum(int n,int r,int a){
        if(r==1){
            return n*a;
        }
        else{
            return a*(1-Math.pow(r, n))/1-r;
        }
    }
    public static List<Integer> factor(int n){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                list.add(i);
            }
        }
        return list;
    }
    public static int replace(int n){
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='5'){
                sb.setCharAt(i, '0');
            }
            if(sb.charAt(i)=='0'){
                sb.setCharAt(i, '5');
            }
        }
        return Integer.parseInt(sb.toString());
    }     
    public static String checkHarshad(int n){
        int sum=0;
        String st= Integer.toString(n);
        for(int i=0;i<=n;i++){
            sum=sum + Character.getNumericValue(st.charAt(i));
        }
        if(n%sum==0){
            return "YES";
        }
        else{
            return "NO";
        }
    }   
    public static void main(String[] args) {
        
    }
}
