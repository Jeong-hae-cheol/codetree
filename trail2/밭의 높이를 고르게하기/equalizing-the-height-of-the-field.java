import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();        
        int[] arr = new int[n];
        int[] costs = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();            
            costs[i] = Math.abs(arr[i] - h);
        }
        // Please write your code here.
        
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n-t+1; i++) {
            int sum = 0;
            for (int j = 0; j < t; j++) {
                sum += costs[i+j];
            }
            ans = Math.min(ans, sum);
        }

        System.out.print(ans);
    
    }
}