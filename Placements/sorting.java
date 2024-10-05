public class sorting {
    public static void bubbleSort(int arr[]){
        for(int turn =0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void divide(int arr[], int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr,si,mid,ei);
    }
    public static void conquer(int arr[],int si,int mid,int ei){
        int merger[] = new int[ei-si+1]; ///length of new array

        int idx1=si; //first array track
        int idx2=mid+1; //2nd array track
        int x=0; //merger track

        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                merger[x++]=arr[idx1++];
            }else{
                merger[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            merger[x++]=arr[idx1++];
        }
        while(idx2<=ei){
            merger[x++]=arr[idx2++];
        }

        //copy in og
        for(int i=0,j=si;i<merger.length;i++,j++){
            arr[j]=merger[i];
        }

    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        bubbleSort(arr);
        int n=arr.length;
        divide(arr, 0, n-1);
        print(arr);
    }
}
