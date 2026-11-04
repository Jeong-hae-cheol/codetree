import java.util.Scanner;

public class Main {
    static int n, ans;
    static int[][] segments;
    static int[] visited = new int[1001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        segments = new int[n][2];
        for (int i = 0; i < n; i++) {
            segments[i][0] = sc.nextInt();
            segments[i][1] = sc.nextInt();
        }
        // Please write your code here.
        solve(0, 0);

        System.out.println(ans);
    }

    static void solve(int count, int position) {
        if (position >= n) {
            ans = Math.max(ans, count);
            return;
        }

        int l = segments[position][0];
        int r = segments[position][1];

        boolean flag = true;

        for (int i = l; i <= r; i++) {
            if (visited[i] != 0)
                flag = false;
            visited[i]++;
        }

        solve(flag ? count + 1 : count, position + 1);

        for (int i = l; i <= r; i++) {
            visited[i]--;
        }

        solve(count, position + 1);

    }
}
