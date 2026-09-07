import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.

        System.out.println(pow(a, b));
    }

    public static int pow(int a, int b) {
        if(b == 0) {
            return 1;
        }

        return a*pow(a, b-1);
    }
}