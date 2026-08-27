import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader  br = new BufferedReader (
            new InputStreamReader(System.in)
        );

        // StringTokenizer st = new StringTokenizer(br.readLine());
        // Please write your code here.

        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());

        if(a >= 1.0 && b >= 1.0) {
            System.out.println("High");
        } else if(a >= 0.5 && b >= 0.5) {
            System.out.println("Middle");
        } else {
            System.out.println("Low");
        }
    }
}