import java.util.Scanner;

public class Main {
    static int n, a, b, c, a2, b2, c2;    
    static int[] choices = new int[3];
    static int ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        a2 = sc.nextInt();
        b2 = sc.nextInt();
        c2 = sc.nextInt();
        // Please write your code here.
        DFS(0);

        System.out.print(ans);
    }

    public static void DFS(int cnt) {
        if(cnt == 3) {
            if(check()) {
                ans++;                
            }            
            return;
        }

        for (int i = 1; i <= n; i++) {                                    
            choices[cnt] = i;
            DFS(cnt+1);            
        }
    }    

    public static boolean check() {        
        boolean ret = true;
        int[] arr1 = new int[] {a,b,c};
        int[] arr2 = new int[] {a2,b2,c2};

        for (int i = 0; i < 3; i++) {
            int left = choices[i] - arr1[i];
            int right = arr1[i] - choices[i];

            if(left < 0) {
                left += n;
            }

            if(right < 0) {
                right += n;
            }

            int result = Math.min(left, right);

            if(result > 2) {
                ret = false;
                break;
            }
        }

        if(ret) {
            return ret;
        }


        ret = true;

        for (int i = 0; i < 3; i++) {
            int left = choices[i] - arr2[i];
            int right = arr2[i] - choices[i];

            if(left < 0) {
                left += n;
            }

            if(right < 0) {
                right += n;
            }

            int result = Math.min(left, right);

            if(result > 2) {
                ret = false;
                break;
            }
        }

        return ret;
    }
}