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
        int ans = Integer.MAX_VALUE;
        int dist = 1;
        for (int i = 1; i < n-1; i++) {
            int sum = 0;
            for (int j = 1; j < n; j++) {
                if(i == j) {
                    dist = 2;
                    continue;
                }
                sum += Math.abs(x[j] - x[j-dist]) + Math.abs(y[j] - y[j-dist]);
                // System.out.printf("(%d, %d) -> (%d, %d) dist: %d\n", x[j], y[j], x[j-dist], y[j-dist], Math.abs(x[j] - x[j-dist]) + Math.abs(y[j] - y[j-dist]));
                dist = 1;
            }
            ans = Math.min(ans, sum);            
        }        
        System.out.print(ans);
    }
}