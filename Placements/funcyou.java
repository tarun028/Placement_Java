import java.util.*;
public class funcyou {

    public static void printMan(){
        System.out.println("hello");
        System.out.println("cunt");
    }
    public static int sum(int a ,int b){
        int sum = a+b;
        return sum;
    }
    public static float product(int num1 ,int num2){
        return num1*num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        printMan();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sum(a, b);
        float product= product(a, b);
        System.out.println(sum);
        System.out.println(product);

    }
}
