package DAy5_arrayu;
//akes input of 5 subjects
//Calculates Sum
//Calculates Average
import java.util.Scanner;
public class sumofelement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int sum = 0;
        double avg;

        // Input 5 subject marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks of Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        // Calculate average
        avg = sum / 5.0;

        // Display marks
        System.out.println("\nMarks of 5 Subjects:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + " = " + marks[i]);
        }

        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + avg);

        sc.close();
    }
}
