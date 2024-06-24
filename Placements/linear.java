public class linear {
    public static void linearSearch(int arr[], int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                System.out.println("Found at"+arr[i]+"on location\n"+i);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int key = 3;
        linearSearch(arr, key);
    }
}
