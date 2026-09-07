import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int idx = 0;
        int index = 0;
        String[] arr = new String[100];

        while(true) {
            String str = br.readLine();
            if(str.equals("0")) {
                break;
            }
            
            if(idx % 2 == 0) {
                arr[index++] = str;                
            }
            idx++;
        }
        System.out.println(idx);
        for(int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
    }
}