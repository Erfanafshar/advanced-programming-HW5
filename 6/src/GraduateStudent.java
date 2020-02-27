/**
 * The Graduate Student class that extend from Student class
 * And have some personal fields and methods
 * *
 *
 * @author Erfan
 * @version 1
 * @since 3/18/2018
 */
public class GraduateStudent extends Student {

    // Fields //

    // The nubmer of units that each Graduate Student must pass
    private final int numberOfUnits = 32;

    // The name of the supervisor of the student
    private String supervisorName;

    // The name of the undergraduate University of the student
    private String undergraduateUniversity;

    // Constructor //

    /**
     * Create an Undergraduate student object with given first name and last name and student number
     * And supervisor name and undergraduate University
     *
     * @param supervisorname          The name of the supervisor of the student
     * @param undergraduateUniversity The name of the undergraduate University of the student
     * @param fName                   The first name of the student
     * @param lName                   The last name of the student
     * @param studentNum              The number of the student
     */
    public GraduateStudent(String supervisorname, String undergraduateUniversity, String fName, String lName, int studentNum) {
        super(fName, lName, studentNum);
        this.supervisorName = supervisorname;
        this.undergraduateUniversity = undergraduateUniversity;
    }

    // Methods //

    /**
     * Get the number of the units
     *
     * @return The number of the units
     */
    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Get the supervisor name of the units
     *
     * @return The supervisor name
     */
    public String getSupervisorName() {
        return supervisorName;
    }

    /**
     * Set the supervisor name of the units
     *
     * @param supervisorName The supervisor name
     */
    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    /**
     * Get the Undergraduate University name
     *
     * @return The Undergraduate University name
     */
    public String getUndergraduateUniversity() {
        return undergraduateUniversity;
    }

    /**
     * Set the Undergraduate University name
     *
     * @param undergraduateUniversity The Undergraduate University name
     */
    public void setUndergraduateUniversity(String undergraduateUniversity) {
        this.undergraduateUniversity = undergraduateUniversity;
    }

    /**
     * Display the information of the Student like
     * The first name and the last name and the number
     * And numberOfUnits and  supervisor Name and undergraduate University
     */
    public void displayStudentInformation() {
        super.displayInfo();
        System.out.println("Number of units : " + numberOfUnits
                + " - Supervisor name : " + supervisorName
                + " - Undergraduate university : " + undergraduateUniversity + "\n");

    }

}
