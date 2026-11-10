import java.io.*;
import java.util.*;

public class Main {
    public static BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in)
    );
    public static StringTokenizer st = new StringTokenizer("");
    
    public static String nextToken() throws IOException {
        while(!st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }

        return st.nextToken();
    }

    public static final int MAX_N = 100000;

    public static int n;

    public static int[] uf = new int[MAX_N + 1];

    public static void initialize() {
        for(int i = 1; i <= n; i++) {
            uf[i] = i;
        }
    }

    public static int find(int x) {
        if(uf[x] == x) {
            return x;
        }

        // int rootNode = find(uf[x]);
        // uf[x] = rootNode;
        // return rootNode;
        return uf[x] = find(uf[x]);
    }

    public static void union(int a, int b) {
        int A = find(a);
        int B = find(b);

        uf[A] = B;
    }
    
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(nextToken());

        initialize();
        
        for (int i = 0; i < n - 2; i++) {
            int a = Integer.parseInt(nextToken());
            int b = Integer.parseInt(nextToken());

            union(a, b);
        }
        
        int rootNode = find(1);

        for(int i = 2; i <= n; i++) {
            if(rootNode != find(i)) {
                System.out.println(1 + " " + i);
                break;
            }
        }
    }
}