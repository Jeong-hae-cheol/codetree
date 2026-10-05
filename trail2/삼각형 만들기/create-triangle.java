import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int answer = 0;

        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    int w = 0, h = 0;
                    if(x[i] == x[j]) {
                        w = Math.max(Math.abs(y[i] - y[j]), w);
                    }

                    if(x[j] == x[k]) {
                        w = Math.max(Math.abs(y[j] - y[k]), w);
                    }

                    if(x[i] == x[k]) {
                        w = Math.max(Math.abs(y[i] - y[k]), w);
                    }
                    
                    if(y[i] == y[j]) {
                        h = Math.max(Math.abs(x[i] - x[j]), h);
                    }

                    if(y[j] == y[k]) {
                        h = Math.max(Math.abs(x[j] - x[k]), h);
                    }

                    if(y[i] == y[k]) {
                        h = Math.max(Math.abs(x[i] - x[k]), h);
                    }                    
                    answer = Math.max(answer , w*h);
                }
            }
        }

        System.out.print(answer);
    }
}