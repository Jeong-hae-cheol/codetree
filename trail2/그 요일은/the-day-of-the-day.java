import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        // Please write your code here.

        int cnt = 0;
        int diff = 0;
        int[] numOfDays = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        if(A.equals(day[diff%7])) {
            cnt++;
        }

        while(true) {
            if(m1 == m2 && d1 == d2) {
                break;
            }

            diff++;
            d1++;            

            if(d1 > numOfDays[m1]) {
                d1 = 1;
                m1++;
            }    

            if(A.equals(day[diff%7])) {
                cnt++;
            }        
        }

        // if(A.equals(day[(diff+1)%7])) {
        //     cnt++;
        // }   

        System.out.print(cnt);
    }
}