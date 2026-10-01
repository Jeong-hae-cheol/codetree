import java.util.Scanner;
public class Main {
    static char[] arr = new char[101];
    static int minLeft, maxRight;
    static int ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
        minLeft = Integer.MAX_VALUE;
        maxRight = 0;
        for (int i = 0; i < n; i++) {
            int position = sc.nextInt();
            char ch = sc.next().charAt(0);

            arr[position] = ch;
            maxRight = Math.max(position, maxRight);
            minLeft = Math.min(position, minLeft);
        }
        // Please write your code here.
        solve();    

        System.out.print(ans);
    }

    public static void solve() {
        for (int l = minLeft; l <= maxRight; l++) {
            if(arr[l] == '\0') continue;
            for (int r = maxRight; r >= l; r--) {
                if(ans >= r-l) 
                    break;
                if(arr[r] == '\0') 
                    continue;

                if(check(l, r)) {                    
                    ans = Math.max(ans, r-l);
                }
            }
        }
    }

    public static boolean check(int l, int r) {
        int G = 0;
        int H = 0;

        for (int i = l; i <= r; i++) {
            if(arr[i] == 'G') {
                G++;
            }

            if(arr[i] == 'H') {
                H++;
            }
        }

        if(G == 0 || H == 0 || G == H) {
            return true;
        }

        return false;
    }
}