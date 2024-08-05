public class a {

    public static void find(int arr[],int data){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==data){
                System.out.println("found");
            }
            else{
                System.out.println("not found");
            }
        }

    }

    public static void findocc(int arr[],int data){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==data){
                count++;
            }
            
        }
        System.out.println(count);
    }

    public static void pavg(int arr[]){
        //int n=arr.length;
        int sum=0;
        int c=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>=0){
                sum=sum+arr[i];
                c++;
            }
        }
        System.out.println(sum);
        System.out.println(c);
        System.out.println("avg is "+ sum/c);
    }
    public static void main(String[] args) {
        int arr[]={5, 2, 2, 2, 3};
        int check[]={5, 2, -4, 1, 3};
        //findocc(arr, 2);
        pavg(check);

    }
}
