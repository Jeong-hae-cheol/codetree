import java.io.*;
import java.util.*;
public class Main {
    public static int MAX = 100000;
    public static int n, m;
    public static int[] uf = new int[MAX + 1];

    public static int find(int x) {
        if (uf[x] == x) {
            return x;
        }

        return uf[x] = find(uf[x]);
    }

    public static boolean union(int x, int y) {
        int X = find(x);
        int Y = find(y);

        if (X == Y) {
            return true;
        } else {
            uf[X] = Y;
            return false;
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            uf[i] = i;
        }

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (union(x, y)) {
                System.out.println(i);
                return;
            }
        }
        // Please write your code here.
        System.out.print("happy");
    }
}
