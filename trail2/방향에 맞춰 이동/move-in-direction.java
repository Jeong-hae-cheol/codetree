import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            // Please write your code here.

            switch(direction) {
                case 'N':                
                    c+=distance;
                break;                
                case 'E':
                    r+=distance;
                break;          
                case 'S':
                    c-=distance;
                break;          
                case 'W':
                    r-=distance;
                break;          
            }
        }

        System.out.println(r + " " + c);
    }
}