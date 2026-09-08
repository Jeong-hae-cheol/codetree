import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        if(a > b) {
            a = max(a);
            b = min(b);
        } else {
            b = max(b);
            a = min(a);
        }

        System.out.println(a + " " + b);
    }

    public static int max(int n) {
        return n+25;
    }

    public static int min(int n) {
        return n*2;
    }
}