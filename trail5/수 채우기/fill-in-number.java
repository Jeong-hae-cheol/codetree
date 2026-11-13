import java.util.Scanner;
public class Main {
    public static int MAX = 100000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nn = 0;
        int ans = 0;
        // Please write your code here.
        ans += n / 5;

        nn = n % 5;

        while (nn != 0) {
            if (nn % 2 != 0) {                
                nn += 5;
                ans--;
                if(nn > n) {
                    ans = -1;
                    break;
                }
            } else {
                ans += nn / 2;
                nn = 0;
            }
        }

        System.out.print(ans);

    }
}
