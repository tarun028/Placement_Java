public class trapwater {

    public static int rain(int height[]){
        //calc leftmax array
        int n= height.length;
        int leftmax[] =new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i], leftmax[i-1]);
        }

        //rightmax array
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i], rightmax[i+1]);
        }

        //loop final
        int trap=0;
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftmax[i], rightmax[i]);
            trap+=waterLevel-height[i];
        }
        return trap;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        int n=height.length;
        System.out.println(rain(height));
    }
    
}
