import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(p);
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if(b - p[i] < 0) {
                if(b - (p[i]/2) < 0)  {                    
                    break;
                }
                b -= p[i];
            } else {
                b -= p[i];
            }            
            answer++;
        }

        System.out.print(answer);
    }
}