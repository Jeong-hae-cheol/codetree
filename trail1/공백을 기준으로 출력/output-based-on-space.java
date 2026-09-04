import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        // StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String[] str = br.readLine().split(" ");

        for(String s : str) {
            sb.append(s);
        }        

        str = br.readLine().split(" ");

        for(String s : str) {
            sb.append(s);
        }        
                

        System.out.println(sb);
    }
}