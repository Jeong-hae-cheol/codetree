import java.util.*;

public class Main {
    static int n,k;
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();
        // Please write your code here.
        solve(0);
    }

    static void solve(int cnt) {
        if(cnt == n) {
            for(int i = 0; i < n; i++) {
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
            return;
        }

        for(int i = 1; i <= k; i++) {
            list.add(i);
            solve(cnt+1);
            list.remove(cnt);
        }
    }
}