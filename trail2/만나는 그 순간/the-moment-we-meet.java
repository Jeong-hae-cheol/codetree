import java.util.Scanner;

public class Main {
    public static char[] d = new char[1000];
    public static int[] t = new int[1000];
    public static char[] d2 = new char[1000];
    public static int[] t2 = new int[1000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            d[i] = sc.next().charAt(0);
            t[i] = sc.nextInt();
            sum += t[i];
        }

        max = Math.max(sum, max);
        sum = 0;

        for (int i = 0; i < m; i++) {
            d2[i] = sc.next().charAt(0);
            t2[i] = sc.nextInt();
            sum += t[i];
        }

        max = Math.max(sum, max);

        // Please write your code here.        
        int[] A = new int[2000001];
        int[] B = new int[2000001];        

        int now = 1001;
        int time = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < t[i]; j++) {
                if(d[i] == 'R') {
                    A[time++] = ++now;
                } else {
                    A[time++] = --now;
                }
            }
        }
        
        now = 1001;
        time = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < t2[i]; j++) {
                if(d2[i] == 'R') {
                    B[time++] = ++now;
                } else {
                    B[time++] = --now;
                }
            }
        }

        int ans = -1;

        for (int i = 1; i <= max; i++) {
            if(A[i] == B[i]) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}