import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] *= 2;

            for(int k = 0; k < n; k++) {
                int[] arr2 = new int[n-1];
                int cnt = 0;

                for (int j = 0; j < n; j++) {
                    if(k != j)
                        arr2[cnt++] = arr[j];
                }

                int sum = 0;

                for (int j = 0; j < n-2; j++) {
                    sum += Math.abs(arr2[j] - arr2[j+1]);
                }

                ans = Math.min(ans, sum);
            }

            arr[i] /= 2;
        }

        System.out.print(ans);
    }
}