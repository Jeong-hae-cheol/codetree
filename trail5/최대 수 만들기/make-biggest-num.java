import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr, (a, b) -> {
            String ab = a + b;
            String ba = b + a;

            return ba.compareTo(ab);
        });

        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            sb.append(s);
        }

        // 모든 숫자가 0인 경우
        if (arr[0].equals("0")) {
            System.out.println("0");
        } else {
            System.out.println(sb);
        }
    }
}
