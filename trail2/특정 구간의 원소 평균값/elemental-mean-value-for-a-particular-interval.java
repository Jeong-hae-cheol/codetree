import java.util.Scanner;
public class Main {
    static int[] arr;
    static int ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.                
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n-i; j++) {
                double sum = 0;
                for (int k = j; k < j+i; k++) {
                    sum += arr[k];
                }
                sum /= i;
                // 검수
                for (int k = j; k < j+i; k++) {
                    if(sum == arr[k]) {
                        ans++;
                        break;
                    }
                }
                sum = 0;
            }
        }

        System.out.print(ans);
    }    
}