package Task3;
import java.util.Scanner;  

class Bank_account 
{
    private double balance;  

    public Bank_account(double Starting_bal)
    {
        this.balance = Starting_bal;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void deposit(double amount) 
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Amount successfully Deposited. Current balance: \n" + balance);
        } 
        else
        {
            System.out.println("Amount can not be deposit \n");
        }
    }
    public boolean withdraw(double amount)
    {
        if (amount > 0)
        {
            if (amount <= balance) 
            {
                balance -= amount;
                System.out.println("Amount successfully Withdrawn. Current balance: \n" + balance);
                return true;
            }
            else 
            {
                System.out.println("Insufficient Amount. Current balance: \n" + balance);
            }
        }
        else
        {
            System.out.println("Invalid withdrawal amount. Please enter a positive amount. \n");
        }
        return false;
    }
}
class ATM_Command {
    private Bank_account bankAccount;

    public ATM_Command(Bank_account bankAccount) 
    {
        this.bankAccount = bankAccount;
    }

    public void displayMenu() {
        System.out.println("Menu Detail :");
        System.out.println("Enter 1 for Check Balance");
        System.out.println("Enter 2 for Deposit");
        System.out.println("Enter 3 for Withdraw");
        System.out.println("Enter 4 for Quit");
    }
    public void run() 
    {
        Scanner scan = new Scanner(System.in);
        while (true)
        {
            displayMenu();
            System.out.print("Enter your choice: ");
            int option = scan.nextInt();
            switch (option)
            {
                case 1:
                    System.out.println("Current balance = \n" + bankAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the amount for deposit : \n");
                    double dp_Amount = scan.nextDouble();
                    bankAccount.deposit(dp_Amount);
                    break;
                case 3:
                    System.out.print("Enter the amount for withdrawal : \n");
                    double wd_Amount = scan.nextDouble();
                    boolean Success = bankAccount.withdraw(wd_Amount);
                    if (Success) {
                        System.out.println("Withdrawal successful\n");
                    }
                    break;
                case 4:
                    System.out.println("Thank you!!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again");
            }
        }
    }
}

public class Atm_service
{
    public static void main(String[] args)
    {
        Bank_account userAccount = new Bank_account(100);
        ATM_Command Atm = new ATM_Command(userAccount);
        Atm.run();
    }
}

