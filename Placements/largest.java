import java.util.*;
public class largest {
    public static int largest(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("smallest="+min);
        return max;
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,7,5,6};
        //largest(arr);
        System.out.println(largest(arr));
    }
}
