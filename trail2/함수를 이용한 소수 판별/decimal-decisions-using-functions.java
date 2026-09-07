import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.

        System.out.println(sumSearchDecimal(a, b));
    }

    public static int sumSearchDecimal(int a, int b) {
        int sum = 0;
        
        for(int i = a; i <= b; i++) {
            boolean demical = true;
            for(int j = 2; j <= i/2; j++) {
                if(i % j == 0) {
                    demical = false;
                    break;
                }
            }
            if(demical) {
                sum += i;
            }
        }

        return sum;
    }
}