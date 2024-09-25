package TASK1;

public class DeskCalculator {

    public static int calculateMissingDesks(int numberOfStudents, int numberOfDesks) {
        int requiredDesks = (int) Math.ceil(numberOfStudents / 2.0);

        if (requiredDesks > numberOfDesks) {
            return requiredDesks - numberOfDesks;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        int students = 25;
        int desks = 10;

        int missingDesks = calculateMissingDesks(students, desks);
        System.out.println("Нехватка парт: " + missingDesks);
    }
}
