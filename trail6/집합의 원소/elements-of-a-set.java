import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static final int MAX_N = 100000;

    // 변수 선언
    public static int n, m;

    // 번호별 그룹을 관리합니다.
    public static int[] uf = new int[MAX_N + 1];

    // x의 대표 번호를 찾아줍니다.
    public static int find(int x) {
        // x가 루트 노드라면 x값을 반환합니다.
        if (uf[x] == x)
            return x;
        // x가 루트 노드가 아니라면
        // x의 부모인 uf[x]에서 탐색을 더 진행한 뒤
        // 찾아낸 루트 노드를 uf[x]에 넣어줌과 동시에
        // 해당 노드값을 반환합니다.
        return uf[x] = find(uf[x]);
    }

    // x, y가 같은 집합이 되도록 합니다.
    public static void union(int x, int y) {
        // x, y의 대표 번호를 찾은 뒤
        // 연결해줍니다.
        int X = find(x);
        int Y = find(y);
        uf[X] = Y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 1; i <= n; i++)
            uf[i] = i;

        for (int i = 0; i < m; i++) {
            int qType = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            // Please write your code here.

            // 합치는 명령입니다.
            if (qType == 0)
                union(a, b);
            // 같은 집합에 있는지를 판단하는 명령입니다.
            else {
                // 같은 집합인 경우에는 1을 출력합니다.
                if (find(a) == find(b))
                    System.out.println(1);
                else
                    System.out.println(0);
            }
        }
    }
}
