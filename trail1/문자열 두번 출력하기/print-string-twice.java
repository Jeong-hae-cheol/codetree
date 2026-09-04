import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        String str = br.readLine();
        for(int i = 0; i < 2; i++) {
            System.out.println(str);
        }
    }
}