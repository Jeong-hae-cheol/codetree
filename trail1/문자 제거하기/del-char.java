import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        String s = br.readLine();

        while (s.length() > 1) {

            int n = Integer.parseInt(br.readLine());

            if (n >= s.length()) {
                n = s.length() - 1;
            }

            s = s.substring(0, n) + s.substring(n + 1);

            System.out.println(s);
        }
    }
}