package day_4.recursion;

public class power {
    static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent < 0) {
            return 1 / power(base, -exponent);
        } else {
            return base * power(base, exponent - 1);
        }
    }

    public static void main(String[] args) {
        double base = 2.0; // Example base
        int exponent = 3;   // Example exponent
        double result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
    
}
