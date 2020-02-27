/**
 * The Student abstract class have the common information between
 * Undergraduate Student and Graduate Student
 * *
 *
 * @author Erfan
 * @version 1
 * @since 3/18/2018
 */
public abstract class Student {

    // Fields //

    // The first name of the student
    private String firstName;

    // The last name of the student
    private String lastName;

    // The number of the student
    private int studentNumber;

    // Constructor //

    /**
     * Create an student object with given first name and last name and student number
     *
     * @param fName      The first name of the student
     * @param lName      The last name of the student
     * @param studentNum The number of the student
     */
    public Student(String fName, String lName, int studentNum) {
        firstName = fName;
        lastName = lName;
        studentNumber = studentNum;
    }

    // Methods //

    /**
     * Set the first name of the student
     *
     * @param firstName The first name of the student
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get the first name of the student
     *
     * @return The first name of the student
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the last name of the student
     *
     * @param lastName The last name of the student
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get the last name of the student
     *
     * @return The last name of the student
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the number of the student
     *
     * @param studentNumber The number of the student
     */
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    /**
     * Get the number of the student
     *
     * @return The number of the student
     */
    public int getStudentNumber() {
        return studentNumber;
    }

    /**
     * Display the information of the Student like
     * The first name and the last name and the number
     */
    public void displayInfo() {
        System.out.println("Student firstname : " + getFirstName()
                + " - Student lastname : " + getLastName()
                + " - Student number : " + getStudentNumber());
    }

}
