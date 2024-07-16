public class rev {
    public static void reverse(String str,int idx){
        if(idx==0){
            System.err.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        reverse(str, idx-1);
    }
    public static void main(String[] args) {
        String str="Tarun";
        reverse(str, str.length()-1);
        
    }
}
