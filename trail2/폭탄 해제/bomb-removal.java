import java.util.Scanner;
class solve {
    String uCode;
    char lColor;
    int time;

    public solve(String uCode, char lColor, int time) {
        this.uCode = uCode;
        this.lColor = lColor;
        this.time = time;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.

        solve sol = new solve(uCode, lColor, time);

        System.out.println("code : " + sol.uCode);
        System.out.println("color : " + sol.lColor);
        System.out.println("second : " + sol.time);
    }
}