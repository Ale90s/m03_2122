package javacourse.Section6_OOP_Part1_ClassesConstructorsAndInheritance.Constructors_2.VipCustomer;

public class Main {

    public static void main(String[] args) {

        VipCustomer persona = new VipCustomer();

        System.out.println("The name of this VIP is " + persona.getName());
        System.out.println("He has a credit limit of " + persona.getCreditLimit() + "€");
        System.out.println("His email is: " + persona.getEmail());

        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        VipCustomer persona2 = new VipCustomer("Pepe Sánchez", 2434);

        System.out.println("The name of this VIP is " + persona2.getName());
        System.out.println("He has a credit limit of " + persona2.getCreditLimit() + "€");
        System.out.println("His email is: " + persona2.getEmail());

        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        VipCustomer persona3 = new VipCustomer("Alfred Santana", 8962, "alfredd@gmai.com");

        System.out.println("The name of this VIP is " + persona3.getName());
        System.out.println("He has a credit limit of " + persona3.getCreditLimit() + "€");
        System.out.println("His email is: " + persona3.getEmail());
    }
}
