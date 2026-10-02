import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ability = new int[6];
        int totalSum = 0;
        int ans = (int)1e9;
        for (int i = 0; i < 6; i++) {
            ability[i] = sc.nextInt();
            totalSum += ability[i];
        }
        // Please write your code here.
        for (int i = 0; i < 6-2; i++) {
            int sum = ability[i];
            for (int j = i+1; j < 6-1; j++) {
                sum += ability[j];
                for (int k = j+1; k < 6; k++) {
                    sum += ability[k];                    
                    ans = Math.min(ans, Math.abs(totalSum-(2*sum)));
                    sum -= ability[k];
                }
                sum -= ability[j];
            }
        }

        System.out.print(ans);
    }
}