import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int ans = 0;
        for (int x = 1; x <= n; x++) {
            if(Math.abs(x-a) <= 2) {
                ans += n*n;
                continue;
            }

            for (int y = 1; y <= n; y++) {
                if(Math.abs(y-b) <= 2) {
                    ans+=n;
                    continue;
                }

                for (int z = 1; z <= n; z++) {
                    if(Math.abs(z-c) <= 2) {
                        ans++;
                        continue;
                    }                    
                }
            }
        }

        System.out.print(ans);
    }
}