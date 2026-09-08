import java.util.Scanner;
public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // Please write your code here.
        solve1(1);
        System.out.println();
        solve2(n);
    }

    public static void solve1(int a) {
        if(n < a) {
            return ;
        }
        System.out.printf("%d ", a);
        solve1(a+1);
    }

    public static void solve2(int n) {
        if(n == 0) {
            return ;
        }
        System.out.printf("%d ", n);
        solve2(n-1);
    }    
}