import java.util.Scanner;
public class Main {
    static char[] arr = new char[101];
    static int minLeft, maxRight;
    static int ans = 0;
    static int[] prefixG = new int[102];
    static int[] prefixH = new int[102];
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
        prefixCal();
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
        int G = prefixG[r] - prefixG[l];
        int H = prefixH[r] - prefixH[l];

        if(arr[l] == 'G') {
            G++;
        } else {
            H++;
        }

        if(G == 0 || H == 0 || G == H) {
            return true;
        }
        
        return false;
    }

    static void prefixCal() {
        int G = 0;
        int H = 0;

        for (int l = minLeft; l <= maxRight; l++) {           
            if(arr[l] == 'G') {
                G++;
            }

            if(arr[l] == 'H') {
                H++;
            }
            prefixG[l] = G;
            prefixH[l] = H;
        }
    }
}