import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        // Please write your code here.

        int sex = Integer.parseInt(br.readLine());
        int age = Integer.parseInt(br.readLine());

        String answer = "";

        if(sex != 0) {
            if(age >= 19) {
                answer = "WOMAN";
            } else {
                answer = "GIRL";
            }
        } else {
            if(age >= 19) {
                answer = "MAN";
            } else {
                answer = "BOY";
            }
        }

        System.out.println(answer);
    }
}