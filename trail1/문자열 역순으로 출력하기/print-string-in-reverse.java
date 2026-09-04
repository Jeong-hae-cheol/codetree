import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        // StringTokenizer st = new StringTokenizer(br.readLine());
        String[] str = new String[4];

        for(int i = 0; i < 4; i++) {
            str[i] = br.readLine();
        }

        for(int i = 0; i < 4; i++) {
            System.out.println(str[3-i]);
        }        
    }
}