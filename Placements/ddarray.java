import java.util.*;
public class ddarray {
    public static void main(String[] args) {
        System.err.println("2d ARRAY");

        int matrix[][]= new int[3][4];
        int n=matrix.length;
        int m=matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(matrix[i][j]);
            }
        }
        
    }
}
