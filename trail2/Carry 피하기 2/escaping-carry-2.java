import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int ans = -1;
        for (int i = 0; i < n-2; i++) {
            int sum = -1;
            for (int j = i+1; j < n-1; j++) {
                if(!isCarry(arr[i], arr[j]))
                    continue;
                sum = arr[i] + arr[j];
                for (int k = j+1; k < n; k++) {
                    if(!isCarry(sum, arr[k]))
                        continue;                    
                    sum = sum + arr[k];
                    ans = Math.max(ans, sum);
                    sum = sum - arr[k];
                }
            }                                    
        }

        System.out.print(ans);
    }

    public static boolean isCarry(int a, int b) {
        for (int i = 1; i <= 4; i++) {
            int n = (int)Math.pow(10, i);
            int sum = a%n + b%n;
            if (sum >= n) {
                return false;
            }
        }

        return true;
    }
}