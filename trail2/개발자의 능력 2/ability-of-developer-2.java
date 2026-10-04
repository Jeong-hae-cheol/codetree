import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                
        int[] ability = new int[6];

        for (int i = 0; i < 6; i++) {
            ability[i] = sc.nextInt();
        }
        // Please write your code here.
        int answer = Integer.MAX_VALUE;       
        int totalSum = 0;

        for (int i = 0; i < 6; i++) {
            totalSum += ability[i];
        }

        for (int i = 1; i < 6; i++) {        
            int sum1 = ability[0] + ability[i];

            // 방문하지 않은 첫 번째 사람을 찾기
            int j = 1;
            while (i == j) j++;

            // j의 팀원을 고르는 반복문을 여기에 작성
            for (int k = j+1; k < 6; k++) {
                if(k==i)
                    continue;
                    
                int sum2 = ability[j] + ability[k];
                int sum3 = totalSum - sum1 - sum2;

                int max = Math.max(sum1, sum2);

                max = Math.max(max, sum3);

                int min = Math.min(sum1, sum2);
                min = Math.min(min, sum3);

                answer = Math.min(answer, max-min);
            }            
        }
        System.out.print(answer);
    }
}