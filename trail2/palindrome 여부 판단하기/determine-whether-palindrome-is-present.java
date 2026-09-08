import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        solve(input);
    }

    public static void solve(String input) {
        StringBuilder sb = new StringBuilder(input);        

        if(input.equals(sb.reverse().toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}