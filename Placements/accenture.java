import java.util.*;
public class accenture {

    public static int[] difference(int arr[]){
        if(arr.length<2) return new int[0];

        int result[]=new int[arr.length-1];

        for(int i=0;i<arr.length-1;i++){
            result[i]=arr[i+1]-arr[i];
        }
        return result;
    }

    public static int missing(int arr[]){
        int sum=0;
        int n=arr.length+1; //ek missing haina
        int ogSum=n*(n+1)/2;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return ogSum-sum;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int out[]=difference(arr);

        for(int n:out){
            System.out.println(n+" ");
        }
    }
}
