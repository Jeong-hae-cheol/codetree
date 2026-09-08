import java.util.Scanner;
public class Main {
    static String text;
    static String pattern;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        text = sc.next();
        pattern = sc.next();
        // Please write your code here.
        System.out.println(solve());
    }

    public static int solve() {
        int result = -1;
        int lenPattern = pattern.length();
        int lenText = text.length();

        for(int i = 0; i < lenText - lenPattern + 1; i++) {
            if(text.substring(i, lenPattern+i).equals(pattern)) {
                result = i;
                break;
            }
        }

        return result;
    }
}