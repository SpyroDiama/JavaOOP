package Homework1_A;
//Rectangle class and attributes.
public class Rectangle {
    int width;
    int height;

//Class constructor.
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;

    }

//class method for drawing the rectangle.
    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("*");

                }
                else {
                    System.out.print(" ");

                }
            }       System.out.println();
        }
    }




}

