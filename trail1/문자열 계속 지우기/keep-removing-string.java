import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        String a = br.readLine();
        String b = br.readLine();

        for(int i = 0; i < a.length() - b.length() + 1; i++) {
            String str = a.substring(i, b.length()+i);
            if(str.equals(b)) {
                a = a.substring(0, i) + a.substring(b.length()+i, a.length());                
                i = -1;    
            }
        }

        System.out.println(a);
    }
}