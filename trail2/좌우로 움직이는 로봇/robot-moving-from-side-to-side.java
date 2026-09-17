import java.util.Scanner;

public class Main {
    static int MAX = 2000001;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] A = new int[MAX];
        int[] B = new int[MAX];

        int nowA = MAX / 2 + 1;
        int secA = 1;

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            // Please write your code here.
            for (int j = 0; j < t; j++) {
                if (d == 'R') {
                    A[secA++] = ++nowA;
                } else {
                    A[secA++] = --nowA;
                }
            }
        }
        int nowB = MAX / 2 + 1;
        int secB = 1;

        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            // Please write your code here.
            for (int j = 0; j < t; j++) {
                if (d == 'R') {
                    B[secB++] = ++nowB;
                } else {
                    B[secB++] = --nowB;
                }
            }
        }

        // Please write your code here.
        int ans = 0;
        int start = 0;
        int end = 0;
        boolean flag = false;

        if (secA > secB) {
            for (int i = 1; i < secB; i++) {
                if (A[i] == B[i]) {
                    if (flag) {
                        ans++;
                        flag = false;
                    }
                } else {
                    flag = true;
                }
            }

            for (int i = secB; i < secA; i++) {
                if (A[i] == B[secB - 1]) {
                    if (flag) {
                        ans++;
                        flag = false;
                    }
                } else {
                    flag = true;
                }
            }
        } else {
            for (int i = 1; i < secA; i++) {
                if (A[i] == B[i]) {
                    if (flag) {
                        ans++;
                        flag = false;
                    }
                } else {
                    flag = true;
                }
            }

            for (int i = secA; i < secB; i++) {
                if (B[i] == A[secA - 1]) {
                    if (flag) {
                        ans++;
                        flag = false;
                    }
                } else {
                    flag = true;
                }
            }
        }

        System.out.println(ans);
    }
}
