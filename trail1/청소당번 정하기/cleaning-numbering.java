import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        // StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[3];

        for(int i = 1; i <= N; i++) {
            if(i % 12 == 0) {
                arr[2]++;
            } else if(i % 3 == 0) {
                arr[1]++;
            } else if(i % 2 == 0) {
                arr[0]++;
            }
            
        }
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
    }
}