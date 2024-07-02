import java.util.*;

public class prefixsum {

    public static void input(int arr[], int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr)); // Print the array
    }

    public static void main(String[] args) {
        int a[] = new int[5];
        input(a, 5);
    }
}
