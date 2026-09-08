import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        solve(A);
    }

    public static void solve(String str) {
        char[] cArr = str.toCharArray();        
        char ch = 0;
        boolean flag = false;

        for(char c : cArr) {
            if(ch != c) {
                if(ch == 0) {
                    ch = c;
                } else {
                    flag = true;
                    break;
                }
            }
        }

        if(flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}