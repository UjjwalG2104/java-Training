package day_4;

public class sumofnumber {
    static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {    
        int number = 5; // Example number
        int result = sum(number);
        System.out.println("Sum of first " + number + " natural numbers is: " + result);
    }
    
}
