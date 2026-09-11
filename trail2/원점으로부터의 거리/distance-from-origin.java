import java.util.Scanner;
import java.util.Arrays;

class Point implements Comparable<Point> {
    int idx;
    int x;
    int y;

    public Point(int idx, int x, int y) {
        this.idx = idx;
        this.x = x;
        this.y = y;
    }

    public int compareTo(Point p) {
        int dst1 = Math.abs(p.x) + Math.abs(p.y);
        int dst2 = Math.abs(this.x) + Math.abs(this.y);

        if(dst1 == dst2) {
            return this.idx - p.idx;
        }
        return dst2 - dst1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        Point[] ps = new Point[n];

        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();

            ps[i] = new Point(i+1, points[i][0], points[i][1]);
        }

        Arrays.sort(ps);

        for (int i = 0; i < n; i++) {
            System.out.println(ps[i].idx);
        }
        // Please write your code here.
    }
}