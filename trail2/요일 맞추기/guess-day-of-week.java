import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.

        int[] numOfDays = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int diff = 0;
        int dir = 0;        
        String[] day = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        if(m1 > m2) {
            dir = -1;
        } else if (m1 < m2) {
            dir = 1;
        } else {
            if(d1 > d2) {
                dir = -11;
            } else {
                dir = 1;
            }
        }

        while(true) {
            if(m1 == m2 && d1 == d2) {
                break;
            }

            if(dir == 1) {
                diff++;
                d1++;

                if(d1 > numOfDays[m1]) {
                    d1 = 1;
                    m1++;
                }                
            } else {
                diff++;
                d1--;

                if(d1 == 0) {
                    m1--;
                    d1 = numOfDays[m1];
                }
            }
        }

        int answer = dir > 0 ? diff%7 : 6 - (diff-1)%7;

        System.out.println(day[answer]);
    }
}