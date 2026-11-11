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
    public static int MAX_N = 1000;
    public static int MAX_M = 100000;
    public static int BIG_NUM = (int) 1e9;
    public static int n, m;
    public static List<Element>[] graph = new ArrayList[MAX_N + 1];
    public static PriorityQueue<Element> pq = new PriorityQueue<>();
    public static int[] dist = new int[MAX_N + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 1; i <= n; i++)
            graph[i] = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            graph[u].add(new Element(v, w));
            graph[v].add(new Element(u, w));
        }

        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.

        for (int i = 1; i <= n; i++) {
            if(i == a) {
                dist[i] = 0;
            } else {
                dist[i] = BIG_NUM;
            }            
        }            

        pq.offer(new Element(a, 0));

        while (!pq.isEmpty()) {
            Element curr = pq.poll();

            if (dist[curr.idx] < curr.d) {
                continue;
            }

            for (int i = 0; i < graph[curr.idx].size(); i++) {
                Element next = graph[curr.idx].get(i);
                int newDist = curr.d + next.d;

                if (dist[next.idx] > newDist) {
                    dist[next.idx] = newDist;
                    pq.offer(new Element(next.idx, newDist));
                }
            }
        }

        System.out.print(dist[b]);
    }
}
