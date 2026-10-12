import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.
        int ans = 0;
        for(int i = x; i <= y; i++) {
            int n = i;
            int sum = 0;

            while(n != 0) {
                sum += n % 10;
                n = (int)(n / 10);
            }

            ans = Math.max(sum, ans);
        }

        System.out.print(ans);
    }
}