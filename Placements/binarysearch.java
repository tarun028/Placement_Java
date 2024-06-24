public class binarysearch {
    public static int binary(int arr[], int key){
        int s=0;int e=arr.length-1;

        while(s<=e){
            int mid = (s+e)/2;

            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6};
        int key = 3;
        System.out.println(binary(arr, key));
    }
}
