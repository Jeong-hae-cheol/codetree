import java.util.Scanner;

public class Main {
    static int n;
    static int[] a, b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        // Please write your code here.
        int ans = 0;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    // 3개 제거
                    if(check(i, j, k)) {
                        ans++;
                    }
                }
            }
        }

        System.out.print(ans);
    }

    public static boolean check(int n1, int n2, int n3) {
        boolean[] visited = new boolean[101];
        for (int i = 0; i < n; i++) {
            for (int j = a[i]; j <= b[i]; j++) {
                if(i == n1 || i == n2 || i == n3) {
                    continue;
                }

                if(visited[j] == false) {
                    visited[j] = true;
                } else {
                    return false;
                }
            }
        }

        // System.out.println(n1 + " " + n2 + " " + n3);
        return true;
    }
}