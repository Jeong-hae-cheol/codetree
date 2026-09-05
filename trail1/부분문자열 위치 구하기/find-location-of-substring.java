import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        
        StringBuilder sb = new StringBuilder();

        sb.append(br.readLine());
        String str = br.readLine();
        
        int position = -1;

        for(int i = 0; i <= sb.length() - str.length(); i++) {
            String s = sb.substring(i, str.length()+i);
            if(s.equals(str)) {
                position = i;
                break;
            }
        }
        System.out.println(position);
    }
}