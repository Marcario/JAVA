//Write a Java program to create a class called "Bank" with a
// collection of accounts and methods to add and remove accounts,
// and to deposit and withdraw money. Also define a class called "Account"
// to maintain account details of a particular customer.


import java.util.ArrayList;

public class Bank {


    private static ArrayList<Account> CentenaryBank =new ArrayList<Account>();

    public static ArrayList<Account> getCentenaryBank() {
        return CentenaryBank;
    }

    public static void addAccount(Account newAccount){
        CentenaryBank.add(newAccount);

    }
    public static void removeAccount(Account newAccount){
        CentenaryBank.remove(newAccount);

    }

    public static void deposit() {

    }
}

class Account{
   private String CustomerName;

   private String Email;


   private String AccountNumber;


   private double AccountBalance;

    public Account(String customerName, String email, String accountNumber, double accountBalance) {
        CustomerName = customerName;
        Email = email;
        AccountNumber = accountNumber;
        AccountBalance = accountBalance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        AccountBalance = accountBalance;
    }
}
