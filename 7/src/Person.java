/**
 * The Person class contain the first name and the last name of the person
 * *
 *
 * @author Erfan
 * @version 1
 * @since 3/18/2018
 */
public class Person {

    // Fields //

    // The first name of the person
    private String firstName;

    // The last name of the person
    private String lastName;

    // constructor //

    /**
     * Create a new Person object with given first name and last name
     *
     * @param firstName The first name of the person
     * @param lastName  The last name of the person
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //ADD METHODS IF YOU NEED

    // Methods //

    /**
     * Get the first name of the person
     *
     * @return the first name of the person
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Get the last name of the person
     *
     * @return the last name of the person
     */
    public String getLastName() {
        return lastName;
    }

}
