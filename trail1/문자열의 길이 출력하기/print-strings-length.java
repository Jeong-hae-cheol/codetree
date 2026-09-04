import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        String str = br.readLine();
        int len = str.length();
        str = br.readLine();
        len += str.length();

        System.out.println(len);
    }
}