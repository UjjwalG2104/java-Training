package DAY_2.Conditional_statements;


import java.util.Scanner;

public class bankFd {
     public static void main(String[] args) {
        System.out.println("1. Withdrawal 2. Deposit 3. CurrentBalance 4. FD");
        int balance = 2000;
        
        Scanner obj = new Scanner(System.in);

        int option = obj.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter the amt to withdraw");
                int amt = obj.nextInt();

                if (balance > amt) {
                    balance -= amt;
                    System.out.println(amt + " is debited from your account");
                } else {
                    System.out.println("Insufficient balance");
                }
                break;

            case 2:
                System.out.println("Enter the amt to deposit");
                int amtToDeposit = obj.nextInt();

                balance += amtToDeposit;
                System.out.println("Deposited " + amtToDeposit + ". New balance: " + balance);
                break;
            case 3:
                System.out.println("Current balance: " + balance);
                break;
            case 4:
                System.out.println("Enter the time to deposit your money");
                int time = obj.nextInt();

                System.out.println("Your amt after " + time + " years will be " + (balance * 7 * time) / 100);

                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        obj.close();
    }
}
