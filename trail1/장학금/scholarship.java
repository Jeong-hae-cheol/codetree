import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] score = new int[2];
        score[0] = Integer.parseInt(st.nextToken());
        score[1] = Integer.parseInt(st.nextToken());

        int answer = 0;

        if(score[0] >= 90) {
            if(score[1] >= 95) {
                answer = 100000;
            } else if(score[1] >= 90) {
                answer = 50000;
            }
        }

        System.out.println(answer);
    }
}