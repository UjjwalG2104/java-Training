package day_4.recursion;

public class reverse {
    static int reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        } else {
            int digit = n % 10;
            rev = rev * 10 + digit;
            return reverse(n / 10, rev);
        }
    }

    public static void main(String[] args) {
        int number = 4521; // Example number
        int result = reverse(number, 0);
        System.out.println("Reverse of " + number + " is: " + result);
    }

}
