/**
 * The UndergraduateStudent class that extend from Student class
 * And have some personal fields and methods
 * *
 *
 * @author Erfan
 * @version 1
 * @since 3/18/2018
 */
public class UndergraduateStudent extends Student {

    // Fields //

    // The nubmer of units that each Undergraduate Student must pass
    private final int numberOfUnits = 140;

    // The name of the way that each Undergraduate Student entered to the the university
    private String inputQuota;

    // Constructor //

    /**
     * Create an Undergraduate student object with given input Quota and first name and last name and student number
     *
     * @param inputQuota The name of the way that each Undergraduate Student entered to the the university
     * @param fName      The first name of the student
     * @param lName      The last name of the student
     * @param studentNum The number of the student
     */
    public UndergraduateStudent(String inputQuota, String fName, String lName, int studentNum) {
        super(fName, lName, studentNum);
        this.inputQuota = inputQuota;
    }


    // Methods //

    /**
     * Get the nubmer of the units
     *
     * @return The nubmer of the units
     */
    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Set the inputQuota of the Student
     *
     * @param inputQuota The inputQuota of the Student
     */
    public void setInputQuota(String inputQuota) {
        this.inputQuota = inputQuota;
    }

    /**
     * Get the inputQuota of the Student
     *
     * @return The inputQuota of the Student
     */
    public String getInputQuota() {
        return inputQuota;
    }


    // If this method exit from comments type we will have compile error ....

    /*public void setNumberOfUnits (final int a ){
        numberOfUnits = a;
    }*/


    /**
     * Display the information of the Student like
     * The first name and the last name and the number
     * And the number of units and inputQuota
     */
    public void displayStudentInformation() {
        super.displayInfo();
        System.out.println("Number of units : " + numberOfUnits
                + " - Input quota : " + inputQuota + "\n");

    }

}
