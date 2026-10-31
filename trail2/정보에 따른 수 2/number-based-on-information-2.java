import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[] c = new char[T];
        int[] x = new int[T];
        for (int i = 0; i < T; i++) {
            c[i] = sc.next().charAt(0);
            x[i] = sc.nextInt();
        }
        // Please write your code here.
        int ans = 0;

        for(int i = a; i <= b; i++) {
            int d1 = b+1;
            int d2 = b+1;

            for (int j = 0; j < T; j++) {
                if(c[j] == 'S') {
                    int d = Math.abs(x[j] - i);
                    d1 = Math.min(d, d1);
                } else if(c[j] == 'N') {
                    int d = Math.abs(x[j] - i);
                    d2 = Math.min(d, d2);
                }
            }

            if(d1 == b+1 || d2 == b+1) {
                continue;
            }

            if(d1 <= d2) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
