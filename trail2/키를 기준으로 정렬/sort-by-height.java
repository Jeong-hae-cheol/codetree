import java.util.Scanner;
import java.util.Arrays;

class Person implements Comparable<Person> {
    String name;
    int height;
    int weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person person) {
        if(this.height > person.height) {
            return 1;
        } else if(this.height < person.height) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Person[] person = new Person[n];
        String[] name = new String[n];
        int[] height = new int[n];
        int[] weight = new int[n];

        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();

            person[i] = new Person(name[i], height[i], weight[i]);
        }

        // Please write your code here.
        Arrays.sort(person);

        for (int i = 0; i < n; i++) {
            System.out.println(person[i].name + " " + person[i].height + " " + person[i].weight);
        }
    }
}