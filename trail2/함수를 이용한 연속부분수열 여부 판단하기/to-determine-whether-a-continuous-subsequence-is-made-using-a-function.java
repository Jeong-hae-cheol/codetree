import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.
        solve(a, b, n1, n2);
    }

    public static void solve(int[] a, int[] b, int lenA, int lenB) {
        String str = "No";

        for(int i = 0; i <= lenA - lenB; i++) {
            boolean flag = true;
            for(int j = 0; j < lenB; j++) {
                if(a[i+j] != b[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                str = "Yes";
                break;
            }
        }

        System.out.println(str);
    }
}