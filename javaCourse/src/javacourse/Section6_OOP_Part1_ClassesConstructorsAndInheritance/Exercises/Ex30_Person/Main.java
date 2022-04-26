package javacourse.Section6_OOP_Part1_ClassesConstructorsAndInheritance.Exercises.Ex30_Person;

public class Main {

    public static void main(String[] args) {
        
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        
        System.out.println("FullName = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen());
        
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("FullName = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen());
        
        person.setLastName("Smith");
        System.out.println("FullName = " + person.getFullName());
    }
}
