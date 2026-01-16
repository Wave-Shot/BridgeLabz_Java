/*
 * Problem Statement:
 * Write a Java program to demonstrate the use of a copy constructor
 * by copying data from one object to another.
 */

/*
 * Class Name: Person
 *
 * Description:
 * This class demonstrates the concept of a copy constructor in Java.
 * It allows creating a new Person object by copying the values of
 * another existing Person object.
 */

// Person class demonstrates copy constructor
class Person {

    private String name;
    private int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    // Copies values from another Person object
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void display() {
        System.out.println(name + " - " + age);
    }
}
