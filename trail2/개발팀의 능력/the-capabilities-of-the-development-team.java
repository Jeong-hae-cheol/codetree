import java.util.Scanner;
public class Main {    
    static final int MAX_NUM = 5;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[MAX_NUM];
        int totalSum = 0;
        for (int i = 0; i < MAX_NUM; i++) {
            scores[i] = sc.nextInt();
            totalSum += scores[i];
        }
        // Please write your code here.
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < MAX_NUM-1; i++) {
            for (int j = i+1; j < MAX_NUM; j++) {
                int sum1 = scores[i] + scores[j];

                for(int k = 0; k < MAX_NUM-1; k++) {
                    for (int l = k+1; l < MAX_NUM; l++) {
                        if(k == i || k == j || l == i || l == j)
                            continue;
                        int sum2 = scores[k] + scores[l];
                        int sum3 = totalSum - sum1 - sum2;

                        if(sum1 == sum2 || sum2 == sum3 || sum3 == sum1)
                            continue;

                        int max = Math.max(sum1, sum2);
                        max = Math.max(sum3, max);

                        int min = Math.min(sum1, sum2);
                        min = Math.min(min, sum3);

                        answer = Math.min(answer, max-min);
                    }
                }
            }
        }
        if(answer == Integer.MAX_VALUE)
            answer=-1;
            
        System.out.print(answer);
    }
}