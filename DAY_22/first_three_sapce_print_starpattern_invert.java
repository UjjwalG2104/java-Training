package DAY_22;

public class first_three_sapce_print_starpattern_invert {
    public static void main(String args[]) {
        int line = 4;

        for(int row = 1; row <= line; row++) {

            for(int space = 1; space < row; space++) {
                System.out.print(" ");
            }

            for(int star = 1; star <= line - row + 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
