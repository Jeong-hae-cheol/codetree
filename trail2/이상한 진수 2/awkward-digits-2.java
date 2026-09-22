import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // Please write your code here.
        boolean flag = false;
        int ans = 0;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if(c == '0' && !flag) {
                flag = true;
                c = '1';
            }

            ans += (c - '0') << (a.length()-i-1);
        }
        if(!flag) {
            ans -= 1;
        }
        System.out.print(ans);
    }
}