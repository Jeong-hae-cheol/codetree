import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bCards = new int[n];
        boolean[] hasB = new boolean[2 * n + 1];
        boolean[] useA = new boolean[2 * n + 1];
        for (int i = 0; i < n; i++) {
            bCards[i] = sc.nextInt();
            hasB[bCards[i]] = true;
        }
        // Please write your code here.        
        int ans = 0;
        int cnt = 0;
        for (int i = 1; i <= 2 * n; i++) {            

            if (hasB[i]) {
                cnt++;
            } else {
                if(cnt != 0) {
                    ans++;
                    cnt--;
                }
            }
        }

        System.out.print(ans);
    }
}
