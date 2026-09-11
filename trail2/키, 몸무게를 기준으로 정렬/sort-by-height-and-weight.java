import java.util.Scanner;
import java.util.Arrays;

class Person implements Comparable<Person> {
    String name;
    int h;
    int w;

    public Person(String name, int h, int w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }

    public int compareTo(Person p) {
        if(p.h == this.h) {
           return p.w-this.w;
        }
        return this.h-p.h;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] height = new int[n];
        int[] weight = new int[n];
        Person[] ps = new Person[n];

        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();

            ps[i] = new Person(name[i], height[i], weight[i]);
        }

        Arrays.sort(ps);

        for (int i = 0; i < n; i++) {
            System.out.println(ps[i].name + " " + ps[i].h + " " + ps[i].w);
        }
        // Please write your code here.
    }
}
