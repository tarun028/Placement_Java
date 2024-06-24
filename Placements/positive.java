import java.util.*;
public class positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no: ");

        //positive negative
        int input = sc.nextInt();

        if(input>=0){
            System.out.println("Positive");
        }
        else{
            System.out.println("negative");
        }

    }
}
