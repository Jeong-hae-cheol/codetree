import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] dir = new char[n];
        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            dir[i] = sc.next().charAt(0);
            dist[i] = sc.nextInt();
        }
        // Please write your code here.
        int r = 0;
        int c = 0;
        // 방향 설정
        int d = 0;
        // EWSN
        int[] dr = new int[] {0, 0, -1, 1};
        int[] dc = new int[] {-1, 1, 0, 0};

        int ans = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            d = setDir(dir[i]);

            for (int j = 0; j < dist[i]; j++) {
                r += dr[d];
                c += dc[d];
                ans++;                
                if (r == 0 && c == 0)
                    break;
            }
            if (r == 0 && c == 0)
                break;
        }
        if(r != 0 || c != 0) {
            ans = -1;
        }
        System.out.print(ans);
    }

    static int setDir(char c) {
        int ans = -1;
        switch (c) {
            case 'E':
                {
                    ans = 0;
                }
                break;
            case 'W':
                {
                    ans = 1;
                }
                break;
            case 'S':
                {
                    ans = 2;
                }
                break;
            case 'N':
                {
                    ans = 3;
                }
                break;
        }
        return ans;
    }
}
