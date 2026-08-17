// Practicum No. 1 - Classes, Objects and Constructor
// Bank Account Management using Class, Objects and Constructor

class BankAccount {
    String accountHolderName;
    long accountNumber;
    String accountType;
    double accountBalance;

    // Parameterized Constructor to initialize account details
    BankAccount(String name, long accNo, String type, double balance) {
        accountHolderName = name;
        accountNumber = accNo;
        accountType = type;
        accountBalance = balance;
    }

    // Adds money to the account
    void deposit(double amount) {
        if (amount > 0) {
            accountBalance = accountBalance + amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount: " + amount);
        }
    }

    // Withdraws money if sufficient balance, otherwise displays "Insufficient Balance"
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount: " + amount);
        } else if (amount > accountBalance) {
            System.out.println("Insufficient Balance");
        } else {
            accountBalance = accountBalance - amount;
            System.out.println("Amount withdrawn: " + amount);
        }
    }

    // Displays the current account balance
    void balanceEnquiry() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: " + accountBalance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Ravi", 1001, "Savings", 10000);
        account1.balanceEnquiry();

        System.out.println();
        account1.deposit(5000);

        System.out.println();
        account1.withdraw(3000);

        System.out.println();
        BankAccount account2 = new BankAccount("Meera", 1002, "Savings", 12000);
        account2.withdraw(12000);
        account2.balanceEnquiry();

        System.out.println();
        BankAccount account3 = new BankAccount("Kiran", 1003, "Savings", 10000);
        account3.withdraw(15000);

        System.out.println();
        account1.balanceEnquiry();

        System.out.println();
        account1.deposit(0);

        System.out.println();
        account1.deposit(-500);

        System.out.println();
        account1.withdraw(0);

        // Calling account1.withdraw() with no argument, or calling
        // withdraw()/deposit() without an object name, does not compile
        // in Java (wrong number of arguments / instance method needs an
        // object). Try those separately and record the compiler error.
    }
}