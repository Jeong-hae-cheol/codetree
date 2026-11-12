import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static long s;
    public static long n;

    public static long sum(long num) {
        long sum = 0;

        sum = num*(num+1)/2;

        return sum;
    }

    public static void solve() {
        long left = 1;
        long right = 2000000000;
        int cnt = 0;

        while (left <= right) {
            long mid = (left + right) / 2;

            long sum = sum(mid);

            if (sum <= s) {
                n = Math.max(n, mid);
                left = mid+1;
            } else {
                right = mid-1;
            }            
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );        
        s = Long.parseLong(br.readLine());
        // Please write your code here.
        solve();

        System.out.println(n);
    }
}
