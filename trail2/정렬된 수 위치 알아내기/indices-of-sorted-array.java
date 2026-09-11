import java.util.Scanner;
import java.util.Arrays;

class Point implements Comparable<Point> {
    int idx;
    int n;    

    public Point(int idx, int n) {
        this.idx = idx;
        this.n = n;
    }

    public int compareTo(Point p) {
        return this.n - p.n;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Point[] ps = new Point[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            ps[i] = new Point(i+1, arr[i]);
        }
        // Please write your code here.

        Arrays.sort(ps);

        int position = 1;
        while(position <= n) {
            for(int i = 0; i < n; i++) {
                if(ps[i].idx == position) {
                    System.out.print(i+1 + " ");
                    position++;
                    break;
                }
            }
        }
    }
}