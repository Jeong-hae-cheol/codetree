import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        int ans = 0;

        for (int i = 0; A*i <= C; i++) {
            int cnt = A*i;
            int numB = (C-cnt)/B;

            cnt += B * numB;
            ans = Math.max(ans, cnt);
        }

        System.out.print(ans);
    }
}