import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Element implements Comparable<Element> {
    int idx, d;

    Element(int idx, int d) {
        this.idx = idx;
        this.d = d;
    }

    @Override
    public int compareTo(Element e) {
        return this.d - e.d;
    }

}

public class Main {
    public static int MAX = 100;
    public static int n, m;
    public static List<Element>[] graph = new ArrayList[MAX + 1];
    public static PriorityQueue<Element> pq = new PriorityQueue<>();
    public static int[] dist = new int[MAX + 1];

    public static void dijkstra() {
        pq.offer(new Element(1, 0));

        while (!pq.isEmpty()) {
            Element curr = pq.poll();

            if (dist[curr.idx] < curr.d) {
                continue;
            }

            for (int i = 0; i < graph[curr.idx].size(); i++) {
                Element next = graph[curr.idx].get(i);

                int nd = curr.d + next.d;

                if (dist[next.idx] > nd) {
                    dist[next.idx] = nd;
                    pq.offer(new Element(next.idx, nd));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
            dist[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            graph[u].add(new Element(v, w));            
        }

        // Please write your code here.

        dijkstra();

        for (int i = 2; i <= n; i++) {
            if(dist[i] == Integer.MAX_VALUE) {
                System.out.println(-1);
            } else {
                System.out.println(dist[i]);
            }
        }
    }
}
