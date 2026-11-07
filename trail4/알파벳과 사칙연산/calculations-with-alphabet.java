import java.util.Scanner;
public class Main {
    public static String expression;
    public static int[] alphabet = new int[6]; // a:0, b:1, c:2, d:3, e:4, f:5;
    public static int answer = Integer.MIN_VALUE;

    public static int chToInt(char c) {
        return alphabet[c - 'a'];
    }

    public static int chCal(int n1, int n2, char c) {
        switch (c) {
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case '*':
                return n1 * n2;
        }
        return 0;
    }

    public static int cal() {
        char[] arr = expression.toCharArray();
        int n1 = chToInt(arr[0]);
        int n2 = 0;
        for (int i = 1; i < arr.length; i += 2) {
            char c = arr[i];
            n2 = chToInt(arr[i + 1]);

            n1 = chCal(n1, n2, c);
        }

        return n1;
    }

    public static void solve(int cnt) {
        if (cnt == 6) {
            int sum = cal();
            answer = Math.max(answer, sum);
            return;
        }

        for (int i = 1; i <= 4; i++) {
            alphabet[cnt] = i;
            solve(cnt + 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        expression = sc.next();
        // Please write your code here.
        solve(0);

        System.out.print(answer);
    }
}
