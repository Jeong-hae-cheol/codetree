import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int[] count1 = new int[n];
        int[] count2 = new int[n];
        int answer = 0;
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            count1[i] = sc.nextInt();
            count2[i] = sc.nextInt();
        }
        // Please write your code here.

        for (int target = 123; target <= 987; target++) {
            int[] digits = {
                target / 100,
                (target / 10) % 10,
                target % 10
            };

            if(digits[0] == 0 || digits[1] == 0 || digits[2] == 0) {
                continue;
            }

            if(digits[0] == digits[1] || digits[1] == digits[2] || digits[2] == digits[0]) {
                continue;
            }

            boolean check = true;

            for (int i = 0; i < n; i++) {
                int[] arr = {
                    num[i] / 100,
                    (num[i] / 10) % 10,
                    num[i] % 10
                };

                int cnt1 = 0;
                int cnt2 = 0;

                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if(digits[j] == arr[k]) {
                            if(j == k) {
                                cnt1++;
                            } else {
                                cnt2++;
                            }
                        }
                    }
                }

                if(cnt1 != count1[i] || cnt2 != count2[i]) {
                    check = false;
                    break;
                }
            }

            if(check) {
                answer++;
            }
        }
        System.out.print(answer);
    }
}