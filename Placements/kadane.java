public class kadane {
    public static void kadanes(int arr[],int n){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<n;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println(ms);
    }
    public static void main(String[] args) {
        int num[]={-2,-3,4,-1,-2,1,5,-4};
        int n=num.length;
        kadanes(num,n);
    }
}
