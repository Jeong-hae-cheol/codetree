import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= 5; i++) {
            System.out.printf("%d ", n*i);
        }
    }
}