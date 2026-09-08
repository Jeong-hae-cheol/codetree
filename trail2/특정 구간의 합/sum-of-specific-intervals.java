import java.util.Scanner;
public class Main {
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            // Please write your code here.
            System.out.println(solve(a1-1, a2-1));
        }

        
    }

    public static int solve(int n1, int n2) {
        int sum = 0;
        for(int i = n1; i <= n2; i++) {
            sum += arr[i];
        }
        return sum;
    }
}