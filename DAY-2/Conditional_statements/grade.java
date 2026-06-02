package Conditional_statements;

public class grade {
    public static void main(String[] args) {
        int marks = 85;
        char grade;

        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("The grade for marks " + marks + " is: " + grade);
    }
    
}
