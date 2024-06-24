public class reverse {

    public static void rev(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int temp = arr[e];
            arr[e]=arr[s];
            arr[s]=temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        rev(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
