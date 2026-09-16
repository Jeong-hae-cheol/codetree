import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int diff = 0;
        int cnt = 0;
        int cntMax = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] > diff) {
                cnt++;                
            } else {
                cntMax = Math.max(cntMax, cnt);
                cnt = 1;
            }
            diff = arr[i];
        }
        cntMax = Math.max(cntMax, cnt);
        // Please write your code here.
        System.out.println(cntMax);
    }
}