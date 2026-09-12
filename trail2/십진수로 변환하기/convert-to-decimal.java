import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        String[] spilt = binary.split("");
        
        // Please write your code here.
        int num = 0;

        for(int i = 0; i < spilt.length; i++) {
            num = num * 2 + Integer.parseInt(spilt[i]);
        }

        System.out.print(num);
    }
}