

class BankAccount {
    String accountHolderName;
    long accountNumber;
    String accountType;
    double accountBalance;

    BankAccount(String name, long accNo, String type, double balance) {
        accountHolderName = name;
        accountNumber = accNo;
        accountType = type;
        accountBalance = balance;
    }

    
    void deposit(double amount) {
        if (amount > 0) {
            accountBalance = accountBalance + amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount: " + amount);
        }
    }

    
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


    void balanceEnquiry() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: " + accountBalance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("mohan", 1001, "Savings", 10000);
        account1.balanceEnquiry();

        System.out.println();
        account1.deposit(5000);

        System.out.println();
        account1.withdraw(3000);

        System.out.println();
        BankAccount account2 = new BankAccount("sir", 1002, "Savings", 12000);
        account2.withdraw(12000);
        account2.balanceEnquiry();

        System.out.println();
        BankAccount account3 = new BankAccount("mam", 1003, "Savings", 10000);
        account3.withdraw(15000);

        System.out.println();
        account1.balanceEnquiry();

        System.out.println();
        account1.deposit(0);

        System.out.println();
        account1.deposit(-500);

        System.out.println();
        account1.withdraw(0);

    }
}
