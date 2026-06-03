package Day_3.do_while;

import java.util.Scanner;

public class gues_game  {
    public static void main(String[] args) {
        int player1 = 30;
        int player2 = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        do {
            count++;
            pirnt
            player2= sc.nextInt();
            if(player2>player1){
                System.out.println("Plz guess a smaller numebr ");
            }
            else if(player2<player1){
                System.out.println("guess the bigger no");
            }
            else{
                System.out.println("Player 2 is equal to Player 1");
            }
            
        
        }
    }