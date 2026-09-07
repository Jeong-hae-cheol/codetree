import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        solve(y,m,d);
    }

    public static void solve(int y, int m, int d) {
        if(!isDayCheck(m, d, isLeap(y))) {
            System.out.println(-1);
            return ;
        }

        if(m >= 3 && m <= 5) {
            System.out.println("Spring");
            return;
        }

        if(m >= 6 && m <= 8) {
            System.out.println("Summer");
            return;
        }

        if(m >= 8 && m <= 11) {
            System.out.println("Fall");
            return;
        }

        System.out.println("Winter");
    }
    public static boolean isDayCheck(int m, int d, boolean isLeap) {
        boolean ret = true;

        if(m == 2) {
            if(isLeap) {
                if(d > 29) {                    
                    ret = false;
                }
            } else {
                if(d > 28) {                    
                    ret = false;
                }
            }            
        } else if(m == 4 || m == 6 || m == 9 || m == 11) {
            if(d > 30) {                
                ret = false;
            }
        } else {
            if(d > 31) {
                ret = false;
            }
        }

        return ret;
    }
    public static boolean isLeap(int y) {
        boolean ret = false;
        if(y % 4 == 0) {            
            if(y % 100 != 0) {
                ret = true;
            } else {
                if(y % 400 == 0) {
                    ret = true;
                }
            }
        }
        return ret;
    }
}