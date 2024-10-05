import java.util.*;

public class tcs {
    public static int firstnon(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }

            for(int j=0;j<arr.length;j++){
                if(map.get(arr[i])==1){
                    return arr[i];
                }
            }
            
        }
        return -1;
    }
    public static void reverse(int arr[],int s,int e){
        int st =s;
        int en=e;
        while(st<en){
            int temp=arr[st];
            arr[st]=arr[en];
            arr[en]=temp;
            st++;
            en--;
        }
    }
    public static void rotationleft(int arr[],int d){
        int n=arr.length;
        d=d%n;
        reverse(arr,0,n-1);
        reverse(arr, 0, n-d-1);
        reverse(arr, n-d, n-1);

    }
    public static int equilibriumSum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int leftsum=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            leftsum=arr[i];
            if(leftsum==sum){
                ans=i;
                break;
            }
            leftsum=leftsum+arr[i];
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
        
    }
    public static boolean subset(int arr1[],int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(!set.contains(arr2[i])){
                return false;
            }
        }
        return true;
    }

    public static void moveZerotoEnd(int arr[]){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        while(index<arr.length){
            arr[index++]=0;
        }
    }

    public static boolean sortCheck(int arr[],int n){
        if(n==1||n==0){
            return true;
        }
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
    

    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6};
        int d = 2;
        rotationleft(arr, d);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
