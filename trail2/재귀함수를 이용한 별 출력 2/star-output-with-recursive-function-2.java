import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        solve(n);
    }

    public static void solve(int n) {
        if(n == 0) {
            return ;
        }
        for(int i = 0; i < n; i++) {
            System.out.printf("* ");
        }
        System.out.println();
        solve(n-1);
        for(int i = 0; i < n; i++) {
            System.out.printf("* ");
        }
        System.out.println();
    }
}