package Day_3.do_while;

import java.util.Scanner;

public class gues_game {
    public static void main(String[] args) {

        int player1 = 30;
        int player2 = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        do {
            count++;

            System.out.println("Player 2, guess the number: ");
            player2 = sc.nextInt();

            if (player2 > player1) {
                System.out.println("Please guess a smaller number");
            } else if (player2 < player1) {
                System.out.println("Please guess a bigger number");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }

        } while (player2 != player1);

        System.out.println("Total attempts: " + count);

        sc.close();
    }
}