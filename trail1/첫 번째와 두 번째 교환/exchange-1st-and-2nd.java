import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        String str = br.readLine();
        char c1 = str.charAt(0);
        char c2 = str.charAt(1);

        String answer = "";

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c1) {
                answer += c2;
            } else if(str.charAt(i) == c2) {
                answer += c1;
            } else {
                answer += str.charAt(i);
            }
        }

        System.out.println(answer);
    }
}