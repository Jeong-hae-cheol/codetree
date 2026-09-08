import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(solve(n));
    }

    public static int solve(int n) {
        if(n == 0) {
            return 0;
        }
        int number = n % 10;

        return number*number + solve(n/10);
    }
}