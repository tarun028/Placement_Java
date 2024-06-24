public class arraybasics {
    
    public static void update(int num[]){
        for(int i=0;i<num.length;i++){
            num[i]=num[i]+1;
        }
    }

    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        String fruits[] = {"a","b"};
        update(num);

        for(int i=0;i<num.length;i++){
            System.out.println(num[i]+" ");
        }
        System.err.println();
    }

}
