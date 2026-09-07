import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        String str = br.readLine();
        String answer = "";

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c >= '0' && c <= '9') {
                answer += c;
            } else if(c >= 'a' && c <= 'z') {
                answer += c;
            } else if(c >= 'A' && c <= 'Z') {
                answer += (char)(c - 'A' + 'a');
            }
        }
        System.out.println(answer);
    }
}