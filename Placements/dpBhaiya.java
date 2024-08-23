import java.util.*;
public class dpBhaiya {

    public static int minCoins(int n, int arr[],int dp[]){
        
        //n - is total price to make ex- 18
        if(n==0) return 0;

        int ans=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){

            if(n-arr[i]>=0){
                int subAns=0;

                if(dp[n-arr[i]]!=-1){
                    subAns=dp[n-arr[i]];
                }
                else{
                    subAns=minCoins(n-arr[i], arr, dp);
                }

                if(subAns!=Integer.MAX_VALUE && subAns+1<ans){
                    ans=subAns+1; //+! kyuki ek pehle hi select karliya upar se ek coin
                }
            }

        }
        
        return dp[n]=ans;

    }
    public static void main(String[] args) {
        int arr[]={5,7,1};
        int n=18;

        int dp[]=new int[n+1];
        Arrays.fill(dp, -1);
        dp[0]=0;

        int ans=minCoins(n,arr,dp);
        System.out.println(ans);

    }
}
