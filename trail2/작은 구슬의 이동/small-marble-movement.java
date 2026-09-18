import java.util.Scanner;

public class Main {    
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();
        int C = sc.nextInt();
        char D = sc.next().charAt(0);

        // TRLB
        int[] dr = new int[]{-1, 0, 0, 1};
        int[] dc = new int[]{0, 1, -1, 0};
        int dir = 0;
        // Please write your code here.

        switch(D) {
            case 'U':
            {
                dir = 0;
                break;
            }
            case 'R':
            {
                dir = 1;
                break;
            }
            case 'L':
            {
                dir = 2;
                break;
            }
            case 'D':
            {
                dir = 3;
                break;
            }
        }
        
        for (int i = 1; i <= T; i++) {
            if(inRange(R+dr[dir], C+dc[dir])) {
                R += dr[dir];
                C += dc[dir];
            } else {
                dir = 3 - dir;
            }
        }

        System.out.print(R + " "+ C);
    }

    static boolean inRange(int r, int c) {
        if(r < 1 || r > N || c < 1 || c > N) {
            return false;
        }
        return true;
    }
}