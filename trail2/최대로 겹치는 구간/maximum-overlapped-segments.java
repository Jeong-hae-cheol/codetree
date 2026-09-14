import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        int[] arr = new int[200];

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();

            for(int j = x1[i]+100; j < x2[i]+100; j++) {
                arr[j]++;
            }
        }
        // Please write your code here.
        int max = 0;

        for(int i = 0; i < 200; i++) {
            max = Math.max(arr[i], max);
        }

        System.out.println(max);
    }
}