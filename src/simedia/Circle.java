package simedia;

import java.util.Scanner;

public class Circle {
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea(){

        return Math.PI * this.radius * this.radius;

    }

    double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    static Circle createCircle() {
        double radius;
        System.out.print("\nInput the radius of the circle. Must be positive number: ");
        boolean isRadiusValid;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                radius = sc.nextDouble();
            } catch (Exception e) {
                radius = -1;
                sc.next();
            }

            if (radius <= 0) {
                System.out.print("Invalid number input! Enter a valid number for the radius of the circle: ");
                isRadiusValid = false;
            }
            else isRadiusValid = true;

        } while (!isRadiusValid);

        return new Circle(radius);
    }

    @Override
    public String toString() {
        return "Circle[radius = " + radius + "]";
    }
}
