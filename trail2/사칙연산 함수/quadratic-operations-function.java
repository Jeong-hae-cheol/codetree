import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.

        if(isOp(o)) {
            System.out.println(a + " " + o + " "+ c + " = " + solve(a,o,c));
        } else {
            System.out.println("False");
        }
    }

    public static int solve(int a, char o, int c) {
        int ret = 0;

        switch(o) {
            case '+': {
                ret = a+c;
            }
            break;
            case '-': {
                ret = a-c;
            }
            break;
            case '*': {
                ret = a*c;
            }
            break;
            case '/': {
                ret = a/c;
            }
            break;
        }

        return ret;
    }

    public static boolean isOp(char o) {
        boolean ret = false;

        if(o == '+' || o == '-' || o == '*' || o == '/') {
            ret = true;
        }

        return ret;
    }
}