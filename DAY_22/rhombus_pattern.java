package DAY_22;

public class rhombus_pattern {
    public static void main(String args[]) {

        for(int row = 1; row <= 5; row++) {

            for(int col = 1; col <= 5 - row; col++) {
                System.out.print(" ");
            }

            System.out.println("*****");
        }
    }
}
