import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int h;
    int w;
    int num;

    public Student(int h, int w, int num) {
        this.h = h;
        this.w = w;
        this.num = num;
    }

    public int compareTo(Student student) {
        if(this.h == student.h) {
            return student.w - this.w;
        }
        return this.h - student.h;
    }
}
public class Main {
    public static final int MAX_N = 1000;

    public static int[] h = new int[MAX_N];
    public static int[] w = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] sts = new Student[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            w[i] = sc.nextInt();

            sts[i] = new Student(h[i], w[i], i+1);
        }
        // Please write your code here.

        Arrays.sort(sts);

        for (int i = 0; i < n; i++) {
            System.out.println(sts[i].h + " " + sts[i].w + " " + sts[i].num);
        }
    }
}
