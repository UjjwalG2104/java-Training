package Day_3;

public class amstrong {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int count = 0;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

         temp = num;
         double sum = 0;
         while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp = temp / 10;
         }

         if ((int) sum == num) {
            System.out.println(num + " is an Armstrong number.");
         } else {
            System.out.println(num + " is not an Armstrong number.");
         }
         

        
    }
    
}
