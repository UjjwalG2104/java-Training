package DAY_22.while_loop;

public class palindrome {
    int num = 12321;
    int reverse = 0;
    while(num != 0) {
        int lastDigit = num % 10;
        reverse = reverse * 10 + lastDigit;
        num = num / 10;
    }
    if(num == reverse){
        System.out.println("Palindrome2");
    }
    else{
        System.out.println("Not Palindrome");
    }

        }
