import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        // StringTokenizer st = new StringTokenizer(br.readLine());
        String str = br.readLine();
        String a = br.readLine();
        int cnt = 0;

        for(String s : str.split("")) {
            if(a.equals(s)) {
                cnt++;
            }
        }
                

        System.out.println(cnt);
    }
}