import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] score_A = new int[2];
        int[] score_B = new int[2];
        score_A[0] = Integer.parseInt(st.nextToken());
        score_A[1] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        score_B[0] = Integer.parseInt(st.nextToken());
        score_B[1] = Integer.parseInt(st.nextToken());

        String answer = "A";

        if(score_A[0] < score_B[0]) {
            answer = "B";
        } else if(score_A[0] == score_B[0]) {
            if(score_A[1] < score_B[1]) {
                answer = "B";
            }
        }

        System.out.println(answer);
    }
}