package javacourse.Section6_OOP_Part1_ClassesConstructorsAndInheritance.Constructors_2.BankAccount;

public class BankAccount {

    private String customerName;
    private String phoneNumber;
    private String email;
    private int accNumber;
    private double balance;

    public BankAccount() {
        this("Default name","Default phone", "Default address", 567889, 2.50);
        System.out.println("Empty constructor called, default setting are being setted");
    }

    public BankAccount(String name, String number, String email, int accNumber,
            double balance) {
        System.out.println("Your account is being setted.");
        this.customerName = name;
        this.phoneNumber = number;
        this.email = email;
        this.accNumber = accNumber;
        this.balance = balance;
    }
    
    public BankAccount(String name, String phoneNumber,String mail) {
        this(name, phoneNumber, mail, 9999, 1000);
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setPhoneNumber(String number) {
        this.phoneNumber = number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAccNumber(int n) {
        this.accNumber = n;
    }

    public void setBalance(double n) {
        this.balance = n;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public int getAccNumber() {
        return this.accNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void depositMoney(double amount) {
        this.balance += amount;
        System.out.println("Deposit of " + amount + " made. New balance is " + this.balance);
    }

    public void withdrawMoney(double amount) {
        if (this.balance - amount >= 0) {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " processed. Remaining balance: "
                    + this.balance);
        } else {
            System.out.println("Only " + this.balance + "€ available. Withdrawal not processed");
        }

    }
}
