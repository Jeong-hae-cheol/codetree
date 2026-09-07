import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        func(n, m);
    }

    public static void func(int n, int m) {
        int num = n;
        int i = 1;

        while(true) {
            num = n*i;

            if(num % m == 0) {
                break;
            }
            i++;
        }

        System.out.println(num);
    }
}