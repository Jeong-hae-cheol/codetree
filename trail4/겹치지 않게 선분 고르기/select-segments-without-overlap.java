import java.util.ArrayList;
import java.util.Scanner;

class Pair {
    int l, r;

    Pair(int l, int r) {
        this.l = l;
        this.r = r;
    }
}

public class Main {
    static int n, ans;
    static Pair[] segments;
    static ArrayList<Pair> pairs = new ArrayList<>();

    public static boolean overlapped(Pair p1, Pair p2) {
        // if(p1.r < p2.l || p2.r < p1.l) {
        //     return true;
        // }

        return p1.r < p2.l || p2.r < p1.l;
    }

    public static boolean possible() {
        for (int i = 0; i < pairs.size() - 1; i++) {
            for (int j = i + 1; j < pairs.size(); j++) {
                if (!overlapped(pairs.get(i), pairs.get(j))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void solve(int cnt) {
        if (cnt == n) {
            if(possible()) {
                ans = Math.max(ans, pairs.size());
            }
            return;
        }

        pairs.add(segments[cnt]);

        solve(cnt + 1);

        pairs.remove(pairs.size() - 1);

        solve(cnt + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        segments = new Pair[n];
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            segments[i] = new Pair(l, r);
        }
        // Please write your code here.

        solve(0);
        
        System.out.println(ans);
    }
}
