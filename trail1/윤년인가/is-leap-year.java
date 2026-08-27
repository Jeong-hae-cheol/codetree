import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        int year = Integer.parseInt(br.readLine());
        
        
        boolean answer = true;

        if(year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            answer = false;
        }

        System.out.println(answer);
    }
}