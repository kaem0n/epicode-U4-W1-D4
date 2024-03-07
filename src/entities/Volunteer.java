package entities;

import java.util.Arrays;

public class Volunteer implements CheckAtWorkplace {
    // ATTRIBUTES
    private final String name;
    private final int age;
    private final String[] CV;

    // CONSTRUCTORS
    public Volunteer(String name, int age, String[] arr) {
        this.name = name;
        this.age = age;
        this.CV = arr;
    }

    // METHODS
    @Override
    public String toString() {
        return "Volunteer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", CV=" + Arrays.toString(CV) +
                '}';
    }

    @Override
    public void checkIn() {
        System.out.println(this.name + " check-in at 10:00 AM");
    }
}
