import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();

        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        String newWord1 = new String(chars1);
        String newWord2 = new String(chars2);

        if(newWord1.equals(newWord2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        // Please write your code here.
    }
}