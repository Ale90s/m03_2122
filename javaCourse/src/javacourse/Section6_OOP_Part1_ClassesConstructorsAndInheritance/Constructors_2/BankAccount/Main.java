package javacourse.Section6_OOP_Part1_ClassesConstructorsAndInheritance.Constructors_2.BankAccount;


public class Main {
    
    public static void main(String[] args) {
        
        BankAccount AlesAccount = new BankAccount("Ale Algarra", "959 31 81 01", 
        "Ale@gmail.com", 234950234, 2442.23);
//        BankAccount AlesAccount = new BankAccount();
//        AlesAccount.setCustomerName("Alejandro Algarra");
//        AlesAccount.setPhoneNumber("958 485 021");
//        AlesAccount.setEmail("Ale@gmail.com");
//        AlesAccount.setAccNumber(544825815);
//        AlesAccount.setBalance(2442.23);
        
        System.out.println("The owner of the account is: " + AlesAccount.getCustomerName());
        System.out.println("His phone number is: " + AlesAccount.getPhoneNumber());
        System.out.println("His email is: " + AlesAccount.getEmail());
        System.out.println("His Account Number is: " + AlesAccount.getAccNumber());
        System.out.println("He has " + AlesAccount.getBalance() + "€");
        
        AlesAccount.withdrawMoney(2000);
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        BankAccount pepesAccount = new BankAccount("Pepe", "962 344 234", "email@pepe.com");
        
        System.out.println("The owner of the account is: " + pepesAccount.getCustomerName());
        System.out.println("His phone number is: " + pepesAccount.getPhoneNumber());
        System.out.println("His email is: " + pepesAccount.getEmail());
        System.out.println("His Account Number is: " + pepesAccount.getAccNumber());
        System.out.println("He has " + pepesAccount.getBalance() + "€");
    }
}
