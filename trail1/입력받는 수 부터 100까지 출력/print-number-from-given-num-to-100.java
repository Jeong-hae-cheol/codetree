import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int n = Integer.parseInt(br.readLine());

        for(int i = n; i <= 100; i++) {
            System.out.printf("%d ", i);
        }
    }
}