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

        int prev = 0;
        int cnt = 1;
        int cntMax = 0;
        for (int i = 0; i < n; i++) {
            if(prev != arr[i]) {
                cntMax = Math.max(cntMax, cnt);
                prev = arr[i];                
                cnt = 1;
            } else {
                cnt++;
            }
        }

        cntMax = Math.max(cntMax, cnt);
        
        System.out.println(cntMax);
    }
}