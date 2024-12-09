import java.util.Scanner;

public class FIURegistrar {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("How many students are there to process? ");
        int numStudents = keyboard.nextInt();
        keyboard.nextLine();

        Student[] myStudents = new Student[numStudents];

        createArrayOfStudents(myStudents);
        processArrayOfStudents(myStudents);
    }

    public static Student[] createArrayOfStudents(Student[] myStudents) {

        String firstName;
        String lastName;
        String pantherID;
        double gpa;
        Student aStudent;

        for (int i = 0; i < myStudents.length; i++) {

            System.out.println("What is the first name of student #" + (i+1));
            firstName = keyboard.nextLine();
            System.out.println("What is the last name of student #" + (i+1));
            lastName = keyboard.nextLine();
            System.out.println("What is student #" + (i+1) + "'s panther ID? ");
            pantherID = keyboard.nextLine();
            System.out.println("What is student #" + (i+1) + "'s gpa? ");
            gpa = keyboard.nextDouble();

            //Validation for GPA
            while (gpa <= 0 || gpa > 4) {
                System.out.println("That is not a valid GPA. Enter again. ");
                gpa = keyboard.nextDouble();
            }
            keyboard.nextLine();

            aStudent = new Student(firstName, lastName, pantherID, gpa);
            myStudents[i] = aStudent;
        }
        return myStudents;
    }
    public static void processArrayOfStudents(Student[] myStudents) {
        int maxIndex = 0;
        int minIndex = 0;
        double maxGpa = myStudents[0].getGpa();
        double minGpa = myStudents[0].getGpa();
        double average = myStudents[0].getGpa();

        for (int i = 0; i < myStudents.length; i++) {
            average = (average + myStudents[i].getGpa()) / myStudents.length;

            if (myStudents[i].getGpa() > maxGpa) {
                maxGpa = myStudents[i].getGpa();
                maxIndex = i;
            } else if (myStudents[i].getGpa() < minGpa) {
                minGpa = myStudents[i].getGpa();
                minIndex = i;
            }
        }

        System.out.println("*************************");
        for (int j = 0; j < myStudents.length; j++) {
            System.out.println(myStudents[j]);
            System.out.println("-------------");
        }

        System.out.println("*************************");

        System.out.println("Highest GPA: " + maxGpa);
        System.out.println("Student with highest GPA: " + myStudents[maxIndex]);
        System.out.println("Lowest GPA: " + minGpa);
        System.out.println("Student with lowest GPA: " + myStudents[minIndex]);
        System.out.printf("The average GPA was %.2f", average);
    }
}

