import java.util.Scanner;
public class Main {
    static int c,g,h;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        c = sc.nextInt();
        g = sc.nextInt();
        h = sc.nextInt();
        int[] ta = new int[n];
        int[] tb = new int[n];
        for (int i = 0; i < n; i++) {
            ta[i] = sc.nextInt();
            tb[i] = sc.nextInt();
        }
        // Please write your code here.
        int ans = 0;
        for (int i = -1000; i < 2000; i++) {
            int sum = 0;
            for(int j = 0; j < n; j++) {
                sum += solve(ta[j], tb[j], i);
            }
            ans = Math.max(ans, sum);
        }

        System.out.print(ans);
    }

    public static int solve(int ta, int tb, int temp) {
        if(temp < ta)
            return c;
        if(temp <= tb)
            return g;
        
        return h;
    }
}