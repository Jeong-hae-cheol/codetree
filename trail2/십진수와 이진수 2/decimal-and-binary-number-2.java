import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        String[] split = binary.split("");
        int n = 0;

        for (int i = 0; i < split.length; i++) {
            n = n * 2 + Integer.parseInt(split[i]);
        }

        n = n * 17;

        int[] digit = new int[20];
        int cnt = 0;
        

        while (true) {
            if (n < 2) {
                digit[cnt] = n;
                break;
            }
            
            digit[cnt++] = n%2;
            n /= 2;            
        }

        for (int i = cnt; i >= 0; i--) {
            System.out.print(digit[i]);
        }
    }
}
