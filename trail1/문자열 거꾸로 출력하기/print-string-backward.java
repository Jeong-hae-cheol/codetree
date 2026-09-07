import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        while(true) {
            String str = br.readLine();
            if(str.equals("END")) {
                break;
            }

            StringBuilder sb = new StringBuilder(str);
            sb.reverse();

            System.out.println(sb);
        }                                
    }
}