import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int T = sc.nextInt();
        int[][] shakes = new int[T+1][3];
        for (int i = 1; i <= T; i++) {
            shakes[i][0] = sc.nextInt();
            shakes[i][1] = sc.nextInt();
            shakes[i][2] = sc.nextInt();
        }
        // Please write your code here.
        int[] iCnt = new int[N + 1]; //감염 가능 횟수
        int[] infection = new int[N + 1]; // 전염 된지 안된지
        int[] sec = new int[251]; // 초 단위에 따른 shakes 위치
        infection[P] = 1;
        iCnt[P] = K;

        for (int i = 1; i <= T; i++) {
            sec[shakes[i][0]] = i;
        }

        for (int i = 1; i <= 250; i++) {
            int idx = sec[i];
            int pX = shakes[idx][1];
            int pY = shakes[idx][2];

            if (infection[pX] == 1 && iCnt[pX] > 0) {
                if (infection[pY] != 1) {
                    infection[pY] = 1;
                    iCnt[pY] = K;                    
                } else {
                    iCnt[pY]--;
                }
                iCnt[pX]--;
            } else if (infection[pY] == 1 && iCnt[pY] > 0) {
                if (infection[pX] != 1) {
                    infection[pX] = 1;
                    iCnt[pX] = K;                    
                } else {
                    iCnt[pX]--;
                }
                iCnt[pY]--;
            }
        }

        for(int i = 1; i <= N; i++) {
            System.out.print(infection[i]);
        }
    }
}
