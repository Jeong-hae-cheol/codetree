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

            if(c >= 'A' && c <= 'Z') {
                answer += (char)(c - 'A' + 'a');
            } 

            if(c >= 'a' && c <= 'z') {
                answer += (char)(c - 'a' + 'A');
            } 
        }
        System.out.println(answer);
    }
}