import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();
        // Please write your code here.
        char[] cmds = commands.toCharArray();
        // N E S W
        int[] dx = new int[] {0, 1, 0, -1};
        int[] dy = new int[] {1, 0, -1, 0};
        int dir = 0;

        int ans = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < cmds.length; i++) {
            switch (cmds[i]) {
                case 'L':
                    dir = (dir + 3) % 4;
                    break;
                case 'R':
                    dir = (dir + 1) % 4;
                    break;
                case 'F':
                    x += dx[dir];
                    y += dy[dir];
                    break;                
            }

            ans++;

            if(x == 0 && y == 0) {
                break;
            }
        }

        if(x != 0 || y != 0) {
            ans = -1;
        }

        System.out.print(ans);
    }
}
