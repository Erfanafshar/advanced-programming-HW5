// Add Queue Class

import java.util.Queue;

/**
 * The Main class for make objects and continue the program .
 * *
 *
 * @author Erfan
 * @version 1
 * @since 3/18/2018
 */
public class Main {

    // Method //

    public static void main(String[] args) {

        // Create an object from SimplePersonQueue class
        SimplePersonQueue spq = new SimplePersonQueue();

        // Check the Inheritance of the spq object
        if (spq instanceof Queue) {
            System.out.println("LinkedPersonQueue is an Queue");
        }

        // Check that the queue in empty or not
        if (spq.peek() == null) {
            System.out.println("Queue is empty");
        }

        // Create two object from Person class and add them into spq Queue
        spq.add(new Person("Seyed", "Ahmadpanah"));
        spq.add(new Person("Parham", "Alvani"));

        // Check that Parham Alvani is the head of the queue or not
        if (spq.element().equals(new Person("Parham", "Alvani"))) {
            System.out.println("Parham is on the head of queue");
        }

        // Get the head of the queue
        spq.peek();
        // Get the head of the queue
        spq.peek();

        // Check that the queue in empty or not
        if (spq.size() == 0) {
            System.out.println("Queue is empty");
        }


        //USE OTHER METHODS OF THE SimplePersonQueue CLASS TO TEST ALL UNITS OF YOUR CODE...


        // Add a blank line
        System.out.println();

        // Create 3 new Person object
        Person p1 = new Person("Taha", "Hamidi");
        Person p2 = new Person("Erf", "Ar");
        Person p3 = new Person("Terry", "Zoo");

        // Print the size of the spq queue
        System.out.println(spq.size());

        // Print that the queue in empty or not
        System.out.println(spq.isEmpty());

        // Add a Person to the spq queue and print the result
        System.out.println(spq.add(p1));
        // Add a Persons to the spq queue
        spq.add(p2);

        // Print the size of the spq queue
        System.out.println(spq.size());

        // Check element and peek methods result
        System.out.println(spq.element().getFirstName() + " " + spq.element().getLastName());
        System.out.println(spq.peek().getFirstName() + " " + spq.peek().getLastName());

        // Check contains method with the p1 object and print the result
        System.out.println(spq.contains(p1));

        // Check contains method with the p3 object and print the result
        System.out.println(spq.contains(p3));

        // Check remove method with the p1 object and print the result
        System.out.println(spq.remove(p1));

        // Print the size of the spq queue
        System.out.println(spq.size());

        // Check peek and remove methods result
        System.out.println(spq.peek().getFirstName() + " " + spq.peek().getLastName());
        System.out.println(spq.remove().getFirstName());

        // Print the size of the spq queue
        System.out.println(spq.size());

        // Check the poll method and print the result
        System.out.println(spq.poll().getFirstName());

        // Print the size of the spq queue
        System.out.println(spq.size());

        // Add a Persons to the spq queue
        spq.add(p3);

        // Print the size of the spq queue
        System.out.println(spq.size());

        // Check the clear method
        spq.clear();

        // Print the size of the spq queue
        System.out.println(spq.size());

    }

}
