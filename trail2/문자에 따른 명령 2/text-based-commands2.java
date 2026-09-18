import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.
        char[] f = s.toCharArray();
        int[] cr = new int[2];
        int[] dr = new int[] {0, 1, 0, -1};
        int[] dc = new int[] {-1, 0, 1, 0};
        int dir = 1;

        for (int i = 0; i < f.length; i++) {
            char c = f[i];

            if (c == 'R') {
                dir = (dir + 1) % 4;
            } else if (c == 'L') {
                dir = (dir - 1 + 4) % 4;
            } else {
                cr[0] += dc[dir];
                cr[1] += dr[dir];
            }
        }

        System.out.print(cr[0] + " " + cr[1]);
    }
}
