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
            if(i % 2 == 0 || i % 10 == 5 || (i % 3 == 0 && i % 9 != 0)) {
                continue;
            }
            cnt++;
        }

        return cnt;
    }
}