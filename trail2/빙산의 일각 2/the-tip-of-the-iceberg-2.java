import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        // Please write your code here.
        int ans = 0;

        for (int s = 0; s <= 1000; s++) {
            boolean cns = false;
            int last = -1;
            int total = 0;
            for(int i = 0; i < n; i++) {
                if(h[i] > s) {
                    if(last == -1) {
                        if(!cns) {
                            total++;
                        }                        

                        cns = true;
                        last = h[i];                        
                    }                 
                } else {
                    last = -1;
                    cns = false;
                }
            }

            ans = Math.max(ans, total);
        }

        System.out.println(ans);
    }
}