import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bombs = new int[n+1];
        for (int i = 1; i <= n; i++) {
            bombs[i] = sc.nextInt();
        }
        // Please write your code here.
        int answer = -1;
        for (int i = 1; i <= n; i++) {            
            for (int j = 1; j <= k; j++) {
                if(i+j > n)
                    continue;
                if(bombs[i] == bombs[i+j]) {
                    answer = Math.max(answer, bombs[i]);
                }
            }
        }
        System.out.print(answer);
    }
}