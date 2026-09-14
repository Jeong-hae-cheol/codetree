import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tiles = new int[200001];
        int now = 100000;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            while(x-- > 0) {
                if(d == 'L') {
                    tiles[now] = -1;
                    if(x > 0) {
                    now--;
                }
                } else {
                    tiles[now] = 1;
                    if(x > 0) {
                    now++;
                }
                }                
            }
        }
        // Please write your code here.
        int cntW = 0;
        int cntB = 0;

        for (int i = 0; i < 200001; i++) {
            if(tiles[i] == 1) {
                cntB++;
            }
            if(tiles[i] == -1) {
                cntW++;
            }
        }

        System.out.println(cntW + " " + cntB);
    }
}