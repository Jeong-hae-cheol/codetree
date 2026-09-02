import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        // StringTokenizer st = new StringTokenizer(br.readLine());

        // int A = Integer.parseInt(st.nextToken());
        // int B = Integer.parseInt(st.nextToken());

        // st = new StringTokenizer(br.readLine());        

        String str = br.readLine();
        String[] answer = {"L", "E", "B", "R", "O", "S"};

        for(int i = 0; i < 6; i++) {
            if(str.equals(answer[i])) {
                System.out.println(i);
                return;
            }
        }

        System.out.println("None");
    }
}