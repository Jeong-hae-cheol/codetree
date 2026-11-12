import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static long s;

    // 1부터 num까지의 합이 s 이하인지 확인
    static boolean isPossible(long num) {
        long a;
        long b;

        if (num % 2 == 0) {
            a = num / 2;
            b = num + 1;
        } else {
            a = num;
            b = num / 2 + 1; // (num + 1) / 2와 같은 값
        }

        return a <= s / b;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        s = Long.parseLong(br.readLine());

        long left = 1;
        long right = s;
        long answer = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (isPossible(mid)) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(answer);
    }
}
