import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        // Please write your code here.
        int ans = 0;        
        for(int i = 1; i <= 3; i++) {
            boolean[] stonePosition = new boolean[4];
            int cnt = 0;
            stonePosition[i] = true;
            for (int j = 0; j < n; j++) {
                boolean temp = stonePosition[a[j]];
                stonePosition[a[j]] = stonePosition[b[j]];
                stonePosition[b[j]] = temp;
                
                if(stonePosition[c[j]]) {
                    cnt++;
                }
            }

            ans = Math.max(ans, cnt);
        }

        System.out.println(ans);
    }
}