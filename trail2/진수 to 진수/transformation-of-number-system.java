import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        // Please write your code here.
        String[] split = N.split("");

        int num = 0;
        for (int i = 0; i < split.length; i++) {
            num = num * A + Integer.parseInt(split[i]);
        }

        int[] digit = new int[20];
        int cnt = 0;

        while (true) {
            if(num < B) {
                digit[cnt] = num;
                break;
            }

            digit[cnt++] = num%B;
            num /= B;
        }

        for (int i = cnt; i >= 0; i--) {
            System.out.print(digit[i]);
        }
    }
}