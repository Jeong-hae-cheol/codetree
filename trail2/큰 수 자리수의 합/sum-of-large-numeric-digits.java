import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        System.out.println(solve(a*b*c));
    }

    public static int solve(int n) {
        if(n == 0) {
            return 0;
        }

        return n%10 + solve(n/10);
    }
}