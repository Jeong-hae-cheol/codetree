import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        int month = Integer.parseInt(br.readLine());
        
        
        int answer = 0;

        switch(month) {
            case 1:
            answer = 31;
            break;
            case 2:
            answer = 28;
            break;
            case 3:
            answer = 31;
            break;
            case 4:
            answer = 30;
            break;
            case 5:
            answer = 31;
            break;
            case 6:
            answer = 30;
            break;
            case 7:
            answer = 31;
            break;
            case 8:
            answer = 31;
            break;
            case 9:
            answer = 30;
            break;
            case 10:
            answer = 31;
            break;
            case 11:
            answer = 30;
            break;
            case 12:
            answer = 31;
            break;
        }

        System.out.println(answer);
    }
}