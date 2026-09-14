import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int now = 1000;
        int[] arr = new int[2001];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            if(dir == 'R') {
                for(int j = 0; j < x; j++) {
                    arr[now++]++;
                }
            } else {
                for(int j = 0; j < x; j++) {
                    arr[--now]++;
                }
            }
            // Please write your code here.
        }

        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 2) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}