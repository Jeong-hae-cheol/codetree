import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] > t) {
                cnt++;
            } else {
                ans = Math.max(cnt, ans);
                cnt = 0;
            }
        }
        ans = Math.max(cnt, ans);

        System.out.println(ans);
    }
}