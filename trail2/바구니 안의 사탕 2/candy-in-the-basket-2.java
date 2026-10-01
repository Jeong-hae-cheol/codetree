import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] candies = new int[n];
        int[] positions = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
            positions[i] = sc.nextInt();            
        }
        // Please write your code here.
        for (int i = 0; i <= 100; i++)  {
            int sum = 0;
            for (int j = 0-k; j <= k; j++) {                
                if(i+j < 0) 
                    continue;
                for (int z = 0; z < n; z++) {
                    if(positions[z] == i+j) {
                        sum+=candies[z];
                    }
                }
            }
            ans = Math.max(sum, ans);
        }

        System.out.print(ans);
    }    
}