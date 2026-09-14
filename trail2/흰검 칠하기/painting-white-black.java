import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        char[] dir = new char[n];
        int[] whites = new int[200001];
        int[] blacks = new int[200001];
        int[] colors = new int[200001];
        int now = 100000;

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            dir[i] = sc.next().charAt(0);

            for(int j = 0; j < x[i]; j++) {
                if(dir[i] == 'R') {
                    blacks[now]++;                        
                    colors[now] = 1;
                    if(j+1 < x[i]) {
                        now++;
                    }
                } else {
                    whites[now]++;
                    colors[now] = -1;
                    if(j+1 < x[i]) {
                        now--;
                    }
                }
            }
        }

        // Please write your code here.
        int[] answer = new int[3]; // white, black, gray;

        for (int i = 0; i < 200001; i++) {            
            if(blacks[i] >= 2 && whites[i] >= 2) {
                answer[2]++;
            } else {
                if(colors[i] == 1) {
                    answer[1]++;                    
                }
                else if(colors[i] == -1) {
                    answer[0]++;
                }
            }
        }

        System.out.println(answer[0] + " " + answer[1] + " " + answer[2]);
    }
}