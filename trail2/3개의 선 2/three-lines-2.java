import java.util.Scanner;

public class Main {
    static int n, ans;
    static int[] x, y;
    static boolean[] visited;
    static int MAX_N = 20;
    static int MAX_XY = 10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = new int[n];
        y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        for (int i = 0; i <= MAX_XY; i++) {
            for (int j = 0; j <= MAX_XY; j++) {
                for (int k = 0; k <= MAX_XY; k++) {
                    boolean success = true;

                    for (int l = 0; l < n; l++) {
                        if(x[l] == i || x[l] == j || x[l] == k)
                            continue;
                        success = false;
                    }

                    if(success) 
                        ans = 1;

                    success = true;

                    for (int l = 0; l < n; l++) {
                        if(x[l] == i || x[l] == j || y[l] == k)
                            continue;
                        success = false;
                    }

                    if(success) 
                        ans = 1;

                        success = true;

                    for (int l = 0; l < n; l++) {
                        if(x[l] == i || y[l] == j || y[l] == k)
                            continue;
                        success = false;
                    }

                    if(success) 
                        ans = 1;

                        success = true;

                    for (int l = 0; l < n; l++) {
                        if(y[l] == i || y[l] == j || y[l] == k)
                            continue;
                        success = false;
                    }

                    if(success) 
                        ans = 1;
                }
            }
        }

        System.out.println(ans);
    }
}