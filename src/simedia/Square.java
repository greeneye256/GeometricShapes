package simedia;

import java.util.Scanner;

public class Square {

    private double side;

    Square(double side){
        this.side = side;
    }

    double getSide() {
        return side;
    }

    void setSide(double side) {
        this.side = side;
    }

    double getArea(){
        return this.side * this.side;
    }

    double getPerimeter(){
        return 4 * this.side;
    }

    static Square createSquare(){
        double side;
        System.out.print("\nInput the length of the side. Must be positive number: ");
        boolean isSideValid;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                side = sc.nextDouble();
            } catch (Exception e) {
                side = -1;
                sc.next();
            }

            if (side <= 0) {
                System.out.print("Invalid number input! Enter a valid number for the length of the side: ");
                isSideValid = false;
            }
            else isSideValid = true;

        } while (!isSideValid);

        return new Square(side);
    }

    @Override
    public String toString() {
        return "Square[side = " + side + "]";
    }
}
