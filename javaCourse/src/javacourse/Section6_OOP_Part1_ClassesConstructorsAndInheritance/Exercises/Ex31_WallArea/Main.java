package javacourse.Section6_OOP_Part1_ClassesConstructorsAndInheritance.Exercises.Ex31_WallArea;

public class Main {

    public static void main(String[] args) {
        
        Wall wall = new Wall(5,4);
        
        System.out.println("Area = " + wall.getArea());
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        wall.setHeight(-1.5);
        System.out.println("Width = " + wall.getWidth());
        System.out.println("Height = " + wall.getHeight());
        System.out.println("Area = " + wall.getArea());
    }
}
