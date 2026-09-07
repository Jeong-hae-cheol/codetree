import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(sum(n)/10);
    }

    public static int sum(int n) {
        return n*(n+1)/2;
    }
}