import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        String str = br.readLine();        
        int eeCnt = 0;
        int ebCnt = 0;

        for(int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == 'e' && str.charAt(i+1) == 'e') {
                eeCnt++;
            }

            if(str.charAt(i) == 'e' && str.charAt(i+1) == 'b') {
                ebCnt++;
            }
        }
        System.out.println(eeCnt + " " + ebCnt);
    }
}