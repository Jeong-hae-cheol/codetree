import java.util.Scanner;
public class Main {
    static int n, m, k, ans;    
    static int[] position, nums;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // Please write your code here.        
        position = new int[k];

        solve(0);

        System.out.print(ans);
    }

    public static void solve(int cnt) {
        if(cnt == n) {
            ans = Math.max(ans, cal());
            return;
        }

        for(int j = 0; j < k; j++) {            
            position[j] += nums[cnt];
            solve(cnt+1);
            position[j] -= nums[cnt];
        }
    }

    public static int cal() {
        int score = 0;
        for(int i = 0; i < k; i++) {
            if(position[i] < m-1) 
                continue;
            score++;
        }
        return score;
    }
}