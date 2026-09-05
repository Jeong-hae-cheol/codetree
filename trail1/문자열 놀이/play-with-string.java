import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());
        String S = st.nextToken();
        int Q = Integer.parseInt(st.nextToken());

        for(int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            if(n == 1) {
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                char[] arr = S.toCharArray();

                char tmp = arr[a-1];
                arr[a-1] = arr[b-1];
                arr[b-1] = tmp;

                S = String.valueOf(arr);
                System.out.println(S);
            }

            if(n == 2) {
                char x = st.nextToken().charAt(0);
                char y = st.nextToken().charAt(0);

                char[] arr = S.toCharArray();

                for(int j = 0; j < arr.length; j++) {
                    if(arr[j] == x) {
                        arr[j] = y;
                    }
                }
                S = String.valueOf(arr);
                System.out.println(String.valueOf(S));
            }
        }
    }
}