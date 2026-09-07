import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        System.out.println(find369(A, B));
    }

    public static int find369(int A, int B) {
        int cnt = 0;
        for(int i = A; i <= B; i++) {

            if(i % 3 == 0) {
                cnt++;
                continue;
            }

            String str = String.valueOf(i);

            for(int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == '3' || c == '6' || c == '9') {
                    cnt++;
                    break;
                }
            }            
        }

        return cnt;
    }
}