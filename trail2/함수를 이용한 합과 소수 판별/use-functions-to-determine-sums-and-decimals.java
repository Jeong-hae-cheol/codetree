import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.

        System.out.println(solve(a, b));
    }

    public static int solve(int a, int b) {
        int cnt = 0;

        for(int i = a; i <= b; i++) {
            boolean demical = true;
            for(int j = 2; j <= i/2; j++) {
                if(i % j == 0) {
                    demical = false;
                    break;
                }
            }
            if(demical && (i/10 + i%10) % 2 == 0) {
                cnt++;
            }
        }

        return cnt;
    }
}