import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(solve(n));
    }

    public static int solve(int n) {
        if(n == 1)
            return 2;
        if(n == 2)
            return 4;

        return solve(n-1)*solve(n-2)%100;
    }
}