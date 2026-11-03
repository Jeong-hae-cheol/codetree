import java.util.Scanner;

public class Main {    
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();
        int C = sc.nextInt();
        char D = sc.next().charAt(0);
                
        int cr = R, cc = C;

        for (int i = 0; i < T; i++) {
            switch(D) {
                case 'U':
                {
                    if(cr == 1) {
                        D = 'D';
                        break;
                    }
                    cr--;
                }
                break;
                case 'D':
                {
                    if(cr == N) {
                        D = 'U';
                        break;
                    }
                    cr++;
                }
                break;
                case 'L':
                {
                    if(cc == 1) {
                        D = 'R';
                        break;
                    }
                    cc--;
                }
                break;
                case 'R':
                {
                    if(cc == N) {
                        D = 'L';
                        break;
                    }
                    cc++;
                }
                break;
            }
        }

        System.out.print(cr + " " + cc);
    }

}