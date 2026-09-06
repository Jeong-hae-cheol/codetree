import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        char[] arr = br.readLine().toCharArray();
        

        for(int i = 0; i < arr.length; i++) {            
            System.out.print(arr[(i+1)%(arr.length)]);
        }
    }
}