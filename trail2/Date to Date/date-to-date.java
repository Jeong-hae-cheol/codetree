import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.

        int elapsedDay = 1;
        int[] numOfDays = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while(true) {
            if(m1 == m2 && d1 == d2) {
                break;
            }

            d1++;
            elapsedDay++;
            if(d1 > numOfDays[m1-1]) {
                m1++;
                d1 = 1;
            }
            if(m1 > 12) {
                m1 = 1;
            }
        }
        System.out.println(elapsedDay);
    }
}