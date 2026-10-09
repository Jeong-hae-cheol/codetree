import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[k][n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int answer = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                if(a == b) {
                    continue;
                }
                boolean flag = true;
                for (int i = 0; i < k; i++) {
                    int aPos = 0;
                    int bPos = 0;
                    for (int j = 0; j < n; j++) {
                        if(a == arr[i][j]) {
                            aPos = j;
                        }

                        if(b == arr[i][j]) {
                            bPos = j;
                        }
                    }

                    if(aPos > bPos) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    answer++;
                }
            }
        }

        System.out.print(answer);
    }
}