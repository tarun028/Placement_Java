import java.util.*;
public class revstring {

    public static void mast(String str,int idx){

        if(idx<0){
            
        }
        System.out.println(str.charAt(idx));
        mast(str,idx-1);

    }

    public static void main(String[] args) {
        String str = "abcd";
        mast(str,str.length()-1);
    }
}
