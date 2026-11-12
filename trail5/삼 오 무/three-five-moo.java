import java.util.Scanner;
public class Main {
    public static long n, ans;

    public static long getCount(long num) {
        return (num / 3) + (num / 5) - (num / 15);
    }

    public static void solve() {
        long left = 1;
        long right = (long) 2e9;

        while (left <= right) {
            long mid = (left + right) / 2;

            long cal = mid - getCount(mid);

            if (cal == n) {
                while (mid % 3 == 0 || mid % 5 == 0) {
                    mid--;                    
                }
                System.out.print(mid);
                return;
            }

            if (n < cal) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        // Please write your code here.
        solve();

    }
}
