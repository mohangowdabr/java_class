import java.util.*;
class BankAccount{
    String accountHolderName;
    long accountNumber;
    String accountType;
    double accountBalance;
    
    public BankAccount(String name, long accNo, String type, double balance){
        accountHolderName=name;
        accountNumber=accNo;
        accountType=type;
        accountBalance=balance;
    }
    void display(){
        System.out.println("----Account Details----");
        System.out.println("Account Holder: "+accountHolderName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Type: "+accountType);
        System.out.println("Account Balance: Rs. "+accountBalance);
    }
    void deposit(double amount){
        if (amount<=0){
            System.out.println("Invalid amount! Deposit must be greater than 0.");
        }else{
            accountBalance+=amount;
            System.out.println("Rs. "+amount+" deposited successfully.");
            System.out.println("Current Balance: Rs. "+accountBalance);
        }
    }
    void withdraw(double amount){
        if (amount <= 0){
            System.out.println("Invalid amount! Withdrawal must be greater than 0.");
        } else if (amount>accountBalance){
            System.out.println("Insufficient balance!");
        } else{
            accountBalance-=amount;
            System.out.println("Rs. "+amount+" withdrawn successfully.");
        }
    }
    void balanceEnquiry(){
        System.out.println("Current Balance: Rs. "+accountBalance);
    }
}
public class Lab_01{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name=sc.nextLine();
        System.out.print("Enter Account Number: ");
        long accNo=sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Account Type: ");
        String type=sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance=sc.nextDouble();

        BankAccount acc=new BankAccount(name, accNo, type, balance);
        acc.display();

        System.out.print("Enter amount to deposit: ");
        acc.deposit(sc.nextDouble());

        System.out.print("Enter amount to withdraw: ");
        acc.withdraw(sc.nextDouble());

        acc.balanceEnquiry();
    }
}