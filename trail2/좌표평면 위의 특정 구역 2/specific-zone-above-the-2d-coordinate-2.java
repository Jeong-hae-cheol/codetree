import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int answer = (int)2e10;

        for (int i = 0; i < N; i++) {
            int minX = (int)2e10, minY = (int)2e10, maxX = 0, maxY = 0;
            for (int j = 0; j < N; j++) {
                if(i == j) {
                    continue;
                }

                int cx = x[j], cy = y[j];
                minX = Math.min(minX, cx);
                minY = Math.min(minY, cy);
                maxX = Math.max(maxX, cx);
                maxY = Math.max(maxY, cy);
            }
            answer = Math.min(answer, (maxX - minX) * (maxY - minY));
        }

        System.out.print(answer);
    }
}