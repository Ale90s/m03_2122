package javacourse.Section6_OOP_Part1_ClassesConstructorsAndInheritance.Exercises.Ex33_CarpetCostCalculator;

public class Floor {
    
    private double width;
    private double length;
    
    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
    }
    
    public double getArea() {
        return width * length;
    }
}
