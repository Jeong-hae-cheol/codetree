import java.util.Scanner;

public class Main {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        System.out.println(solve(n-1));
        // System.out.println(primeCount(24, 2));
    }

    public static int solve(int n) {
        if(n == 0) {
            return arr[0];
        }
        
        int[] prime = new int[]{2, 3, 5, 7};
        int[] primeCount = new int[4];
        int result = 1;

        for(int i = 0; i < 4; i++) {
            int max = Math.max(primeCount(arr[n], prime[i]), primeCount(solve(n-1), prime[i]));
            int pow = 1;
            for(int j = 0; j < max; j++) {
                pow *= prime[i];
            }
            // System.out.println(max + " " + pow);
            result *= pow;
        }                
        return result;
    }

    public static int primeCount(int n, int prime) {
        int cnt = 0;
        while(n % prime == 0) {
            n /= prime;
            cnt++;
        }

        return cnt;
    }
}