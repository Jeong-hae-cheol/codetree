import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        solve(m, d);
    }

    public static void solve(int m, int d) {
        String str = "No";
        switch(m) {
            case 1:
                if(d >= 0 && d <= 31) {
                    str = "Yes";
                }
            break;
            case 2:
                if(d >= 0 && d <= 28) {
                    str = "Yes";
                }
            break;
            case 3:
                if(d >= 0 && d <= 31) {
                    str = "Yes";
                }
            break;
            case 4:
                if(d >= 0 && d <= 30) {
                    str = "Yes";
                }
            break;
            case 5:
                if(d >= 0 && d <= 31) {
                    str = "Yes";
                }
            break;
            case 6:
                if(d >= 0 && d <= 30) {
                    str = "Yes";
                }
            break;
            case 7:
                if(d >= 0 && d <= 31) {
                    str = "Yes";
                }
            break;
            case 8:
                if(d >= 0 && d <= 31) {
                    str = "Yes";
                }
            break;
            case 9:
                if(d >= 0 && d <= 30) {
                    str = "Yes";
                }
            break;
            case 10:
                if(d >= 0 && d <= 31) {
                    str = "Yes";
                }
            break;
            case 11:
                if(d >= 0 && d <= 30) {
                    str = "Yes";
                }
            break;
            case 12:
                if(d >= 0 && d <= 31) {
                    str = "Yes";
                }
            break;
        }
        System.out.println(str);
    }
}