import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int sum = 0;
        int count = 0;

        for (int i = A; i <= B; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                sum += i;
                count++;
            }
        }

        double mean = Math.round((double) sum / count * 10) / 10.0;

        System.out.println(sum + " " + mean);
    }
}