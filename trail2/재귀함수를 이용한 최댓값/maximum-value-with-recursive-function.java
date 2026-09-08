import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        System.out.println(solve(arr, n));
    }

    public static int solve(int[] arr, int n) {
        if(n == 0) {
            return 0;
        }

        return Math.max(arr[n-1], solve(arr, n-1));
    }
}