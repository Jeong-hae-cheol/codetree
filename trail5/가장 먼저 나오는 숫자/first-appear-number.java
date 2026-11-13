import java.util.Scanner;
public class Main {
    public static int n, m;
    public static int[] arr;

    public static int solve(int x) {
        int left = 1;
        int right = n;
        int mid = 0;
        boolean flag = false;

        while (left <= right) {
            mid = (left + right) / 2;

            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            if(arr[mid] == x) {
                flag = true;                
            } else {
                if(flag) {
                    mid = right+1;                    
                }
            }
            
        }

        return arr[mid] == x ? mid : -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] queries = new int[m];
        for (int i = 0; i < m; i++) {
            queries[i] = sc.nextInt();
        }
        // Please write your code here.
        for (int i = 0; i < m; i++) {
            System.out.println(solve(queries[i]));
        }
    }
}
