package DAY_22;

public class first_three_sapce_print_starpattern {
     public static void main(String args[]) {
        int line = 5;

        for(int row = 1; row <= line; row++) {
            for(int space = 1; space <= line - row; space++)

            {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
} 
