import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.
        int ans = 0;

        for (int i = x; i <= y; i++) {
            int n = i;
            boolean[] visited = new boolean[10];
            int cnt = 0;
            int num = -1; // 2개 이상인 숫자
            boolean flag = true; // 흥미로운 숫자인가?
            while(n != 0) {
                if(visited[n%10]) {
                    if(num == -1) {
                        num = n%10;
                    } else if(num != n%10){
                        flag = false;
                        break;
                    }
                } else {
                    visited[n%10] = true;
                    cnt++;
                }                                
                n = (int)(n / 10);
            }            
            if(flag && cnt == 2) {
                // System.out.println(i);
                ans++;
            }
        }

        System.out.print(ans);
    }
}