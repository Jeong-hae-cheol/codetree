import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());    
        }

        for(int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());

            int n1 = Integer.parseInt(st.nextToken());

            switch(n1) {
                case 1:
                    int a = Integer.parseInt(st.nextToken());
                    System.out.println(arr[a-1]);
                break;
                case 2:
                    int b = Integer.parseInt(st.nextToken());
                    int idx = 0;
                    for(int j = 1; j <= N; j++) {
                        if(b == arr[j-1]) {
                            idx = j;
                            break;
                        }
                    }
                    System.out.println(idx);
                break;
                case 3:
                    int s = Integer.parseInt(st.nextToken());
                    int e = Integer.parseInt(st.nextToken());
                    for(int j = s; j <= e; j++) {
                        System.out.printf("%d ", arr[j-1]);
                    }
                    System.out.println();
                break;
            }
        }

        

        // System.out.println(cnt);
    }
}