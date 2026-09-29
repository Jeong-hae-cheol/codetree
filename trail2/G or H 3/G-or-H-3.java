import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[10001];
        int ans = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int pos = sc.nextInt();
            char c = sc.next().charAt(0);
            int score = c == 'H'? 2 : 1;

            max = Math.max(pos, max);
            arr[pos] = score;            
        }        
        // Please write your code here.

        for (int i = 0; i < 10000-k+1; i++) {
            int sum = 0;
            for (int j = 0; j <= k; j++) {
                sum += arr[i+j];
            }
            ans = Math.max(ans, sum);
        }

        System.out.print(ans);
    }
}