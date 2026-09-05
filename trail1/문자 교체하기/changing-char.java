import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        String str = br.readLine();
        String[] arr = str.split(" ");

        System.out.println(arr[0].substring(0,2) + arr[1].substring(2, arr[1].length()));
    }
}