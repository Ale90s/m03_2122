package javacourse.Section6_OOP_Part1_ClassesConstructorsAndInheritance.Exercises.Ex32_Point;

public class Point {

    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double xB = 0, yB = 0, xA = x, yA = y;
        return Math.sqrt((double)((xB - xA) * (xB - xA) + (yB - yA) * (yB - yA)));
    }
    
    public double distance(int xB, int yB) {
        return Math.sqrt((double)((xB - x) * (xB - x) + (yB - y) * (yB - y)));
    }
    
    public double distance(Point p) {
        
        int xB = p.getX();
        int yB = p.getY();
        
        return Math.sqrt((double)((xB - x) * (xB - x) + (yB - y) * (yB - y)));
    }
}
