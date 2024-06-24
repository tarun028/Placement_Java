public class prime {
    public static boolean Prime(int n){
        boolean isPrime = true;
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        return isPrime;
    } 

    public static void printRange(int n){
        for(int i=0;i<=n;i++){
            if(Prime(i)==true){
                System.out.println(i);
            }
        }
        //System.out.println("No prime");
    }
    public static void main(String[] args) {
        //System.out.println(Prime(1));
        printRange(10);
    }
}
