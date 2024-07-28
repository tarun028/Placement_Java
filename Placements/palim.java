public class palim {

    public static boolean mast(String str,int start,int end){
        if(start>=end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        start++;
        end--;
        return mast(str, start, end);
    }
    public static void main(String[] args) {
        String str="naman";
        boolean t=mast(str, str.charAt(0), str.charAt(str.length()-1));
        System.out.println(t);

    }    
}
