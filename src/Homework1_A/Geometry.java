package Homework1_A;
//Main function class that calls on rectangle
public class Geometry {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,5);
        Rectangle r2 = new Rectangle(5,10);
//Output for the rectangles.
        System.out.println("Rectangle 1");
        r1.draw();

        System.out.println("Rectangle 2");
        r2.draw();
    }
}
