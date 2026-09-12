import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int[] digit = new int[20];
        int cnt = 0;

        while(true) {
            if(n < b) {
                digit[cnt] = n;
                break;
            }

            digit[cnt++] = n%b;
            n/=b;
        }

        for (int i = cnt; i >= 0; i--) {
            System.out.print(digit[i]);
        }
    }
}