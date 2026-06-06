package day_4.recursion;

public class 4521count {
    static int countDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 1 + countDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        int number = 4521; // Example number
        int result = countDigits(number);
        System.out.println("Number of digits in " + number + " is: " + result);
    }
    
}
