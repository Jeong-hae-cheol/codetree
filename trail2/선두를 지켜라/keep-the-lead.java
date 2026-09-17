import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][2];

        for (int i = 0; i < n; i++) {
            A[i][0] = sc.nextInt(); // 속도
            A[i][1] = sc.nextInt(); // 시간
        }

        int[][] B = new int[m][2];

        for (int i = 0; i < m; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
        }
        // Please write your code here.
        int[] A_time = new int[1000001];
        int[] B_time = new int[1000001];

        int now_time_A = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < A[i][1]; j++) {
                A_time[now_time_A] = A_time[now_time_A - 1] + A[i][0];
                now_time_A++;
            }            
        }

        int now_time_B = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < B[i][1]; j++) {
                B_time[now_time_B] = B_time[now_time_B - 1] + B[i][0];
                now_time_B++;
            }            
        }

        int dir = 0;
        int cnt = 0;

        for (int i = 1; A_time[i] != 0; i++) {
            if(A_time[i] > B_time[i]) {
                if(dir == -1) {
                    cnt++;
                }
                dir = 1;
            }

            if(A_time[i] < B_time[i]) {
                if(dir == 1) {
                    cnt++;
                }
                dir = -1;
            }
        }

        System.out.println(cnt);
    }
}