import java.util.List;
import java.util.Scanner;
public class Main {
    public static int MAX = 100000;
    public static int n, m;
    public static int[] uf = new int[MAX + 1];
    public static int[] sz = new int[MAX + 1];

    public static int find(int x) {
        if (uf[x] == x) {
            return x;
        }

        return uf[x] = find(uf[x]);
    }

    public static void union(int x, int y) {
        int X = find(x);
        int Y = find(y);
        if (X != Y) {
            uf[X] = Y;

            // 사이즈를 누적해줍니다.
            sz[Y] += sz[X];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // Please write your code here.
        for (int i = 1; i <= n; i++) {
            uf[i] = i;
            sz[i] = 1;
        }

        for (int i = 0; i < m; i++) {
            char c = sc.next().charAt(0);

            if (c == 'x') {
                int a = sc.nextInt();
                int b = sc.nextInt();

                union(a, b);
            } else {
                int a = sc.nextInt();
                int X = find(a);

                System.out.println(sz[X]);
            }
        }
    }
}
