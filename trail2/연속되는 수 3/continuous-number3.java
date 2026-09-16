import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        // Please write your code here.        
        int signR = 0;
        int cnt = 1;
        int cntMax = 0;

        for (int i = 0; i < n; i++) {
            int sign = 0;            
            if(arr[i] >= 0) {
                sign = 1;
            } else {
                sign = -1;
            }

            if(signR != sign) {
                signR = sign;
                cntMax = Math.max(cntMax, cnt);
                cnt = 1;
            } else {
                cnt++;
            }
        }

        cntMax = Math.max(cntMax, cnt);
        System.out.println(cntMax);
    }
}