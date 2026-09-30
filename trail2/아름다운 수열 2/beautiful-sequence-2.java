import java.util.Scanner;
public class Main {
    static int N,M;
    static int[] A,B;    
    static int ans  = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        B = new int[M];
        for (int i = 0; i < M; i++)
            B[i] = sc.nextInt();
        // Please write your code here.
        System.out.println(solve());   
    }

    public static int solve() {
        int[] arr = new int[M];
        int cnt = 0;
        for (int i = 0; i < N-M+1; i++) {
            for (int j = 0; j < M; j++) {
                arr[j] = A[i+j];
            }
            if(check(arr)) {
                cnt++;
            }
        }
        return cnt;
    }

    public static boolean check(int[] arr) {
        boolean[] visited = new boolean[M];
        for (int i = 0; i < M; i++) {
            boolean flag = false;
            for (int j = 0; j < M; j++) {
                if(arr[i] == B[j] && !visited[j]) {
                    flag = true;
                    visited[j] = true;                    
                    break;
                }
            }
            if(!flag) {                
                return false;
            }
        }                
        return true;
    }
}