package Day_3;

import java.util.Scanner;

public class gradepercentage {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        String grade = calculateGrade(marks);
        System.out.println("Marks: " + marks + ", Grade: " + grade);
    }

    public static String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else {
            return "D";
        }
    }

}

