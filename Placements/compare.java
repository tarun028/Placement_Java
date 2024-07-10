public class compare {
    public static void main(String[] args) {
        String n1 = "Tarun";
        String n2 = "Tarun";

        // s1>s2 : +ve value else -ve
        //s1=s2 : 0
        //do not use "=="

        if(n1.compareTo(n2)==0){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
