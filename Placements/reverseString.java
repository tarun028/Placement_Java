public class reverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tarun");
        
        for(int i =0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;

            char fc = sb.charAt(front);
            char bc = sb.charAt(back);

            sb.setCharAt(front, bc);
            sb.setCharAt(back, fc);
        }
        System.out.println(sb);
    }   
}
