import java.util.*;
public class Main {
    static int n;
    static int ans;
    static String bn;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // Please write your code here.
        solve(0);

        System.out.print(ans);
    }

    static void solve(int cnt) {
        if (cnt >= n) {
            if (cnt == n) {
                ans++;
            }
            return;
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                bn += String.valueOf(i);
            }

            solve(cnt + i);
            bn.substring(0, bn.length() - i);
        }
    }    
}
