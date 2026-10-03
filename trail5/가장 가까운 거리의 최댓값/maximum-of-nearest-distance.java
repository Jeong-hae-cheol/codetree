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
    static int n,m,a,b,c;
    static List<Node>[] graph = new ArrayList[MAX_NUM+1];
    static PriorityQueue<Element> pq = new PriorityQueue<>();    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        for (int i = 1; i <= n; i++)
            graph[i] = new ArrayList<>();        

        for (int i = 0; i < m; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int d = sc.nextInt();

            graph[n1].add(new Node(n2,d));
            graph[n2].add(new Node(n1,d));
        }
        // Please write your code here.
        System.out.print(solve()); 
    }

    public static int solve() {
        int[][] dist = search();

        int ans = 0;

        for (int i = 1; i <= n; i++) {

            int minDist = Math.min(
                dist[0][i],
                Math.min(dist[1][i], dist[2][i])
            );

            ans = Math.max(ans, minDist);
        }

        return ans;
    }

    public static int[][] search() {
        int[][] dist = new int[3][n+1];
        for(int k = 0; k < 3; k++) {            
            for (int i = 1; i <= n; i++)
                dist[k][i] = (int)1e9;

            if(k == 0) {
                pq.offer(new Element(0, a));
                dist[k][a] = 0;
            }  

            if(k == 1) {
                pq.offer(new Element(0, b));
                dist[k][b] = 0;
            }

            if(k == 2) {
                pq.offer(new Element(0, c));
                dist[k][c] = 0;
            }

            while(!pq.isEmpty()) {
                Element cur = pq.poll();
                int minIndex = cur.index;
                int minDist = cur.dist;
                
                if(dist[k][minIndex] != minDist) {
                    continue;
                }

                for (int i = 0; i < graph[minIndex].size(); i++) {                
                    int targetIndex = graph[minIndex].get(i).index;
                    int targetDist = graph[minIndex].get(i).dist;

                    int newDist = minDist + targetDist;
                    if(dist[k][targetIndex] > newDist) {
                        dist[k][targetIndex] = newDist;
                        pq.offer(new Element(newDist, targetIndex));                    
                    }
                }
            }
        }        
        return dist;
    }
}
