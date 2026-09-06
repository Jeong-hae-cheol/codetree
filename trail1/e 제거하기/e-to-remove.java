import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        char[] arr = br.readLine().toCharArray();

        boolean flag = true;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == 'e' && flag) {
                flag = false;
                continue;
            }

            System.out.print(arr[i]);
        }
    }
}