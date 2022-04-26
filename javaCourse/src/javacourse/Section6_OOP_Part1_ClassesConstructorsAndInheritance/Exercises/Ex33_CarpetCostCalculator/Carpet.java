package javacourse.Section6_OOP_Part1_ClassesConstructorsAndInheritance.Exercises.Ex33_CarpetCostCalculator;

public class Carpet {

    private double cost;
    
    public Carpet(double cost) {
        this.cost = cost < 0 ? 0 : cost;
    }

    public double getCost() {
        return this.cost;
    }
}
