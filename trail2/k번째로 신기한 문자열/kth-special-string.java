import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // Please write your code here.
        int tLen = t.length();        
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            if(words[i].length() < tLen) {
                continue;
            }
            if(words[i].substring(0, tLen).equals(t)) {
                cnt++;
            }
        }

        String[] words2 = new String[cnt];
        int idx = 0;

        for(int i = 0; i < n; i++) {
            if(words[i].length() < tLen) {
                continue;
            }
            if(words[i].substring(0, tLen).equals(t)) {
                words2[idx++] = words[i];
            }
        
        }
        Arrays.sort(words2);

        System.out.println(words2[k-1]);
    }
}