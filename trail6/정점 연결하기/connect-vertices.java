import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
    public static int MAX = 100000;
    public static int n;
    public static int[][] edges = new int[MAX + 1][2];
    public static int[] uf = new int[MAX+1];

    public static int find(int x) {
        if(uf[x] == x) {
            return x;
        }

        return uf[x] = find(uf[x]);
    }

    public static void union(int x, int y) {
        int X = find(x);
        int Y = find(y);

        if(X != Y) {
            uf[X] = Y;
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );        
        n = Integer.parseInt(br.readLine());        
        for (int i = 0; i < n - 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            edges[i][0] = Integer.parseInt(st.nextToken());
            edges[i][1] = Integer.parseInt(st.nextToken());
        }
        // Please write your code here.

        // uf 초기화
        for (int i = 1; i <= n; i++) {
            uf[i] = i;
        }

        for (int i = 0; i < n-2; i++) {
            int x = edges[i][0];
            int y = edges[i][1];

            union(x, y);
        }
        
        int rootNode = find(1);

        for (int i = 2; i <= n; i++) {
            if(rootNode != find(i)) {
                System.out.print(1 + " " + i);
                break;
            }
        }

    }
}
