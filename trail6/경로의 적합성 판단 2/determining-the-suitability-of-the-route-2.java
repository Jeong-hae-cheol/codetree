import java.util.Scanner;
public class Main {
    public static int MAX = 100_000;
    public static int n, m, k;
    public static int[] uf = new int[MAX + 1];
    public static int[] path;

    public static void union(int a, int b) {
        int x = find(a);
        int y = find(b);

        uf[x] = y;
    }

    public static int find(int x) {
        if (uf[x] == x) {
            return x;
        }

        return uf[x] = find(uf[x]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            uf[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            union(a, b);
        }

        path = new int[k];
        
        for (int i = 0; i < k; i++) {
            path[i] = sc.nextInt();
        }
        // Please write your code here.        

        for(int i = 0; i < k-1; i++) {
            if(find(path[i]) != find(path[i+1])) {
                System.out.print(0);                
                return;
            }
        }
        System.out.print(1);
    }
}
