import java.util.*;
class Node {
    int index, dist;
    Node(int index, int dist) {
        this.index = index;
        this.dist = dist;
    }
}

class Element implements Comparable<Element>{
    int dist, index;

    Element(int dist, int index) {
        this.dist = dist;
        this.index = index;
    }

    @Override
    public int compareTo(Element e) {
        return this.dist - e.dist;
    }
}

public class Main {
    static final int MAX_NUM = 100_000;
    static ArrayList<Node>[] graph = new ArrayList[MAX_NUM+1];
    static PriorityQueue<Element> pq = new PriorityQueue<>();
    static int[] dist = new int[MAX_NUM+1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) 
            graph[i] = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int d = sc.nextInt();

            graph[b].add(new Node(a,d));
        }
        // Please write your code here.

        for (int i = 1; i <= n; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        dist[n] = 0;
        pq.offer(new Element(0, n));

        while(!pq.isEmpty()) {
            Element current = pq.poll();
            int minDist = current.dist;
            int minIndex = current.index;

            if(minDist > dist[minIndex]) {
                continue;
            }

            for (int i = 0; i < graph[minIndex].size(); i++) {
                int targetIndex = graph[minIndex].get(i).index;
                int targetDist = graph[minIndex].get(i).dist;

                int newDist = dist[minIndex] + targetDist;
                if(dist[targetIndex] > newDist) {
                    dist[targetIndex] = newDist;

                    pq.offer(new Element(newDist, targetIndex));
                }
            }
        }

        int ans = 0;

        for (int i = 1; i <= n; i++) {
            ans = Math.max(ans, dist[i]);
        }

        System.out.print(ans);
    
    }
}
