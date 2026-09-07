import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        // Please write your code here.
        System.out.println(func(y));
    }

    public static boolean func(int y) {
        boolean result = true;

        if(y % 4 != 0 || (y % 100 == 0 && y % 400 != 0)) {
            result = false;
        }

        return result;
    }
}