public class maxSumbrute {
    public static void MaxSumArray(int arr[]){
        int currSum=0;
        int maxSum=0;

        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i+1;j<arr.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    currSum+=arr[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }

        }
        System.out.println("max sum array "+maxSum);
    }
    public static void main(String[] args) {
        int arr[]={2,-5,1,9,-1};
        MaxSumArray(arr);

    }
}
