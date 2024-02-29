import java.util.Scanner;

class BankAccount
{
    private double balance;

    public BankAccount(double initialBalance)
    {
        this.balance = initialBalance;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("Transaction Successful!!");
        System.out.println("₹" + amount + " has been transferred to your account");
    }

    public void withdraw(double amount)
    {
        if(amount>balance)
        {
            System.out.println("Transaction Failed!! ... Insufficient funds for withdrawal");
        }
        else
        {
            balance -= amount;
            System.out.println("Transaction Successful!! ... Funds Withdrawn : ₹"+amount);
        }
    }
}

class ATMMachine
{
    private BankAccount userAccount;

    public ATMMachine(BankAccount userAccount)
    {
        this.userAccount = userAccount;
    }

    public void Menu()
    {
        System.out.println("\nATM Menu");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void process(int choice)
    {
        Scanner scanner = new Scanner(System.in);

        switch (choice)
        {
            case 1: System.out.println("Available Balance : ₹" + userAccount.getBalance());
                    break;

            case 2: System.out.print("Enter deposit amount: ₹");
                    double depositAmount = scanner.nextDouble();
                    userAccount.deposit(depositAmount);
                    break;

            case 3: System.out.print("Enter withdrawal amount: ₹");
                    double withdrawalAmount = scanner.nextDouble();
                    userAccount.withdraw(withdrawalAmount);
                    break;

            case 4: System.out.println("Exiting ATM. Thank you!");
                    System.exit(0);
                    break;

            default: System.out.println("Invalid choice. Please enter a valid option.");
        }
    }
}

class ATMSystem
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ₹");
        double initialBalance = scanner.nextDouble();

        BankAccount userAccount = new BankAccount(initialBalance);
        ATMMachine atm = new ATMMachine(userAccount);
        atm.Menu();

        while(true)
        {
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            atm.process(choice);
        }
    }
}
