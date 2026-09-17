import java.util.Scanner;
public class Main {
    static int MAX = 1000000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][2];
        int[][] b = new int[m][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i][0] = sc.nextInt();
            b[i][1] = sc.nextInt();
        }
        // Please write your code here.    
        int[] dA = calDistance(a, n);
        int[] dB = calDistance(b, m);

        int ans = 0;

        for (int i = 1; i <= MAX; i++) {
            if(dA[i] == 0)
                break;
            
            int prev = compareTo(dA[i-1], dB[i-1]);
            int now = compareTo(dA[i], dB[i]);

            if(prev != now) {
                ans++;
            }
            
        }
        System.out.println(ans);
    }

    public static int[] calDistance(int[][] a, int n) {
        int[] dA = new int[MAX+1];
        int sec = 1;
        for (int i = 0; i < n; i++) {
            int v = a[i][0];
            int t = a[i][1];

            for (int j = 0; j < t; j++) {
                dA[sec] = dA[sec-1] + v;
                sec++;
            }
        }

        return dA;
    }

    public static int compareTo(int a, int b) {
        int n = a-b;

        if(n > 0) {
            return 1;
        } else if (n < 0) {
            return -1;
        }
         return 0;
    }
}