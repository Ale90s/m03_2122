package javacourse.Section6_OOP_Part1_ClassesConstructorsAndInheritance.Constructors_2.VipCustomer;

public class VipCustomer {
    
    private String name;
    private double creditLimit;
    private String email;
    
    public VipCustomer () {
        this("Default name", 50000.00, "default@gmail.com");
    }
    
    public VipCustomer (String name, double limit) {
        this(name, limit, "default@gmail.com");
    }
    
    public VipCustomer (String name, double limit, String email) {
        this.name = name;
        this.creditLimit = limit;
        this.email = email;
    }
    
    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }
}
