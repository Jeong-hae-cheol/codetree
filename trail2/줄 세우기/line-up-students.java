import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int h;
    int w;
    int n;

    public Student(int h, int w, int n) {
        this.h = h;
        this.w = w;
        this.n = n;
    }

    public int compareTo(Student st) {
        if(this.h == st.h) {
            if(this.w == st.w) {
                return this.n-st.n;
            } else {
                return st.w - this.w;
            }
        } else {
            return st.h - this.h;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        int[] weight = new int[n];
        int number = 1;
        Student[] st = new Student[n];

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();

            st[i] = new Student(height[i], weight[i], number++);
        }

        Arrays.sort(st);

        for (int i = 0; i < n; i++) {
            System.out.println(st[i].h + " " + st[i].w + " " + st[i].n);
        }
        // Please write your code here.
    }
}