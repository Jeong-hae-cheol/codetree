import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        String str = br.readLine();        
        boolean eeFlag = false;
        boolean abFlag = false;

        for(int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == 'e' && str.charAt(i+1) == 'e') {
                eeFlag = true;
            }

            if(str.charAt(i) == 'a' && str.charAt(i+1) == 'b') {
                abFlag = true;
            }
        }

        if(eeFlag) {
            System.out.print("Yes ");
        } else {
            System.out.print("No ");
        }

        if(abFlag) {
            System.out.print("Yes ");
        } else {
            System.out.print("No ");
        }
    }
}