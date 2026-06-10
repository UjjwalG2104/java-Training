package Day8.oops;

public class SBI {
    
    String name;
    String accNo;
    double balance;    // Global Variable

    // Default Constructor
    SBI()
    {
    }

    // Parameterized Constructor
    SBI(String name, String accNo, double balance)
    {
        this.name = name;+sssss
        this.accNo = accNo;
        this.balance = balance;
    }

    // Deposit Method
    void deposit(double amount)
    {
        balance += amount;
    }

    // Withdraw Method
    void withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }

    // Display Current Balance
    void currentBalance()
    {
        System.out.println("Current Balance = " + balance);
    }

    // Check Account Type
    void checkAccount()
    {
        if(accNo.contains("COR"))
        {
            System.out.println("Corporate Account");
        }
        else if(accNo.contains("BUIS"))
        {
            System.out.println("Business Account");
        }
        else
        {
            System.out.println("Saving Account");
        }
    }

    // Display Account Details
    void showDetails()
    {
        System.out.println("Name : " + name);
        System.out.println("Account No : " + accNo);
        System.out.println("Balance : " + balance);
    }

    // Static Method
    static void bankMaiChori()
    {
        System.out.println("Bank Mai Chori Hui Hai!");
    }
}
    
