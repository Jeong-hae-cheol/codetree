import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int ans = 100;
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                int[] arr = new int[4];
                for(int k = 0; k < n; k++) {
                    if(x[k] > i) {
                        if(y[k] > j) {
                            arr[0]++;
                        } else {
                            arr[3]++;
                        }
                    } else {
                        if(y[k] > j) {
                            arr[1]++;
                        } else {
                            arr[2]++;
                        }
                    }
                }
                int cnt = 0;
                for (int k = 0; k < 4; k++) {
                    cnt = Math.max(arr[k], cnt);
                }

                ans = Math.min(cnt, ans);
            }
        }

        System.out.print(ans);
    }
}