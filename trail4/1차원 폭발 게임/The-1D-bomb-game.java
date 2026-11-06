import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] bombs;

    public static void solve() {
        while (n > 0) {
            int write = 0;
            int i = 0;

            while (i < n) {
                int j = i + 1;

                // 같은 숫자가 연속하는 구간 [i, j)
                while (j < n && bombs[j] == bombs[i]) {
                    j++;
                }

                // M개 미만이면 살아남으므로 앞쪽에 복사
                if (j - i < m) {
                    for (int k = i; k < j; k++) {
                        bombs[write++] = bombs[k];
                    }
                }

                i = j;
            }

            // 이번 차례에 폭발한 폭탄이 없으면 종료
            if (write == n) {
                break;
            }

            n = write;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        bombs = new int[n];
        for (int i = 0; i < n; i++) {
            bombs[i] = sc.nextInt();
        }

        solve();

        StringBuilder sb = new StringBuilder();
        sb.append(n).append('\n');

        for (int i = 0; i < n; i++) {
            sb.append(bombs[i]).append('\n');
        }

        System.out.print(sb);
    }
}