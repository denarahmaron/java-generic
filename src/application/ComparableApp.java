package application;

import util.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Denar", "Bandung"),
                new Person("Ciro","Bandung"),
                new Person("Walter","US")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
