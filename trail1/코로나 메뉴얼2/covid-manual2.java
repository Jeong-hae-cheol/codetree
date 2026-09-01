import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        // StringTokenizer st = new StringTokenizer(br.readLine());

        // int N = Integer.parseInt(st.nextToken());        

        // st = new StringTokenizer(br.readLine());

        int[] cnt = new int[4];

        for(int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String sts = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            if(sts.equals("Y") && num >= 37) {
                cnt[0]++;
            } else if(sts.equals("N") && num >= 37) {
                cnt[1]++;
            } else if(sts.equals("Y")) {
                cnt[2]++;
            } else {
                cnt[3]++;
            }
        }

        for(int i = 0; i < 4; i++) {
            System.out.printf("%d ", cnt[i]);
        }
        if(cnt[0] >= 2) {
            System.out.printf("E");
        }        
    }
}