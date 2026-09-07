import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n);
        // Please write your code here.
    }

    public static void func(int n) {
        if(n % 2 == 0 && ((n/10) + (n%10)) % 5 == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}