import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    if(k != i  && k != j) {
                        sum+=arr[k];
                    }
                }
                if(Math.abs(sum-s) < Math.abs(ans-s)) {
                    ans = sum;
                }
            }
        }

        System.out.print(Math.abs(ans-s));
    }
}