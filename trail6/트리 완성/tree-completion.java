import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int MAX = 100000;
    public static int[] uf = new int[MAX + 1];

    public static int find(int x) {
        if (uf[x] == x) {
            return x;
        }

        return uf[x] = find(uf[x]);
    }

    public static void union(int x, int y) {
        int X = find(x);
        int Y = find(y);

        uf[X] = Y;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] u = new int[m];
        int[] v = new int[m];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            u[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }
        // Please write your code here.

        for (int i = 1; i <= n; i++) {
            uf[i] = i;
        }

        int maxCnt = 0;

        for (int i = 0; i < m; i++) {
            int x = u[i];
            int y = v[i];

            if (find(x) != find(y)) {
                maxCnt++;
                union(x, y);
            }
        }
        // m-maxCnt : 제거 해야할 간선의 수
        // n-1 - maxCnt : 추가 해야할 간선의 수
        System.out.print(n - 1 - maxCnt + (m - maxCnt));
    }
}
