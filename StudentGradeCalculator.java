package Task2_StudentGradeCalculator;

import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= subjects; i++) {

            System.out.print("Enter marks of Subject " + i + ": ");
            int marks = sc.nextInt();

            total = total + marks;
        }

        double average = (double) total / subjects;

        String grade;

        if (average >= 90) {
            grade = "A+";
        }

        else if (average >= 80) {
            grade = "A";
        }

        else if (average >= 70) {
            grade = "B";
        }

        else if (average >= 60) {
            grade = "C";
        }

        else if (average >= 40) {
            grade = "D";
        }

        else {
            grade = "Fail";
        }

        System.out.println("\n===== RESULT =====");
        System.out.println("Total Marks = " + total);
        System.out.println("Average Percentage = " + average + "%");
        System.out.println("Grade = " + grade);

        sc.close();
    }
}