import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Please write your code here.        
        int[] answer = new int[n/2 + n%2];        

        for(int i = 1; i <= n; i++) {
            if(i%2 == 0) {
                continue;
            }
            int[] arr2 = new int[i];
            for(int j = 0; j < i; j++) {
                arr2[j] = arr[j];
            }
            Arrays.sort(arr2);
            System.out.printf("%d ", arr2[i/2]);
        }
    }
}