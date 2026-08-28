import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        StringTokenizer st = new StringTokenizer(br.readLine());

        // int A = Integer.parseInt(st.nextToken());
        // int B = Integer.parseInt(st.nextToken());
        
        BigDecimal test = new BigDecimal(st.nextToken());
        BigDecimal test2 = new BigDecimal(st.nextToken());

        BigDecimal result = test.divide(test2, 20, RoundingMode.DOWN);

        System.out.println(result);
    }
}