package simedia;

import java.util.Scanner;

public class Rectangle {

    private double width;
    private double height;

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    double getArea(){
        return this.width * this.height;
    }

    double getPerimeter(){
        return 2 * (this.width + this.height);
    }

    static Rectangle createRectangle(){
        double height;
        System.out.print("\nInput the height. Must be positive number: ");
        boolean isHeightValid;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                height = sc.nextDouble();
            } catch (Exception e) {
                height = -1;
                sc.next();
            }

            if (height <= 0) {
                System.out.print("Invalid number input! Enter a valid number for height: ");
                isHeightValid = false;
            }
            else isHeightValid = true;

        } while (!isHeightValid);

        double width;
        System.out.print("Input the width. Must be positive number: ");
        boolean isWidthValid;
        do {
            try {
                width = sc.nextDouble();
            } catch (Exception e) {
                width = -1;
                sc.next();
            }

            if (width <= 0) {
                System.out.print("Invalid number input! Enter a valid number for width: ");
                isWidthValid = false;
            }
            else isWidthValid = true;

        } while (!isWidthValid);

        return new Rectangle(width,height);
    }

    @Override
    public String toString() {
        return "Rectangle: [width = " + this.width + ", height = " + height + "]";
    }
}
