public class recursion {

    public static void printminus(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printminus(n-1);
    }
    public static void printplus(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printplus(n+1);
    }

    public static void sum(int i,int n,int sum){

        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        sum(i+1,n,sum);
    }


    public static void fact(int n){
        
    }
    public static void main(String[] args) {
        int n=1;
        //printplus(n);
        sum(0, 3, 0);
    }
}
