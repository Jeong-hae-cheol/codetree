import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        // StringTokenizer st = new StringTokenizer(br.readLine());

        String[] str = new String[10];
        

        for(int i = 0; i < 10; i++) {
            str[i] = br.readLine();
        }    

        char c = br.readLine().charAt(0);

        boolean flag = true;

        for(int i = 0; i < 10; i++) {
            int len = str[i].length();
            if(str[i].charAt(len-1) == c) {
                System.out.println(str[i]);
                flag = false;
            }
        }

        if(flag)
            System.out.println("None");
        // System.out.printf("%d %d", total_length, cnt_a);
    }
}