import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();

        int[] costs = new int[n];

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            costs[i] = Math.abs(value - h);
        }

        int sum = 0;

        // 첫 번째 t개 구간
        for (int i = 0; i < t; i++) {
            sum += costs[i];
        }

        int ans = sum;

        // 한 칸씩 오른쪽으로 이동
        for (int i = t; i < n; i++) {

            sum -= costs[i - t];
            sum += costs[i];

            ans = Math.min(ans, sum);
        }

        System.out.println(ans);
    }
}