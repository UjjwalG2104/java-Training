package Day_3;

public class largestnember {
    public static void main(String[] args) {
        int num = 53293;
        int max = 0;

        while (num != 0) {
            int rem = num % 10;
            if (max < rem) {
                max = rem;
            }
            num = num / 10;
        }
        System.out.println("Largest digit = " + max);
    }
}
