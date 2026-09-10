import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {
    String name;
    int sc1;
    int sc2;
    int sc3;

    public Student(String name, int sc1, int sc2, int sc3) {
        this.name = name;
        this.sc1 = sc1;
        this.sc2 = sc2;
        this.sc3 = sc3;
    }

    public int compareTo(Student student) {
        int thisSum = this.sc1 + this.sc2 + this.sc3;
        int sum = student.sc1 + student.sc2 + student.sc3;

        return thisSum - sum;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();

            students[i] = new Student(name, score1, score2, score3);
        }

        Arrays.sort(students);

        for(int i = 0; i < n; i++) {
            System.out.println(students[i].name + " " + students[i].sc1 + " " + students[i].sc2 + " " + students[i].sc3 + " ");
        }
        // Please write your code here.
    }
}