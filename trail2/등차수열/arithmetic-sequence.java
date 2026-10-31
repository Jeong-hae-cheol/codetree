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

        int ans = 0;

        for (int x = 1; x <= 100; x++) {
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    if(arr[i] + arr[j] == 2*x) {
                        cnt++;
                    }
                }
            }

            ans = Math.max(ans, cnt);
        }

        System.out.println(ans);
    }
}