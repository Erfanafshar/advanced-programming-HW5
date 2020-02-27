/**
 * The Main method for creating objects and continue the program
 *
 * @author Erfan
 * @version 1
 * @since 3/18/2018
 */
public class Main {

    // Method //

    public static void main(String[] args) {

        // Create two Undergraduate Student object
        UndergraduateStudent std1 = new UndergraduateStudent("konkor", "erf", "afsh", 953);
        UndergraduateStudent std2 = new UndergraduateStudent("olampiad", "reza", "zade", 563);

        // Create two Graduate Student object
        GraduateStudent std3 = new GraduateStudent("davod", "amirkabir", "hasan", "miani", 355);
        GraduateStudent std4 = new GraduateStudent("amir", "tehran", "mamad", "rezaei", 765);


        // Print the information of the students
        std1.displayStudentInformation();
        std2.displayStudentInformation();
        std3.displayStudentInformation();
        std4.displayStudentInformation();

        // Set (change) the std1 student number
        std1.setStudentNumber(243);

        // Print the std1 information again to aee the result
        std1.displayStudentInformation();
    }

}
