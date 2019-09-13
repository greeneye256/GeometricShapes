package simedia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        double rectangleArea, rectanglePerimeter, squareArea, squarePerimeter, circleArea, circlePerimeter;
//        Rectangle rectangle = new Rectangle(5.2, 3.1);
//        Square square = new Square(5.2);
//        Circle circle = new Circle(7.0);
//        rectangleArea = rectangle.getArea();
//        squareArea = square.getArea();
//        circleArea = circle.getArea();
//        rectanglePerimeter = rectangle.getPerimeter();
//        squarePerimeter = square.getPerimeter();
//        circlePerimeter = circle.getPerimeter();

        Scanner sc = new Scanner(System.in);

        boolean isDone = false;

        do {
            System.out.println("1. Rectangle");
            System.out.println("2. Square");
            System.out.println("3. Circle");
            System.out.println("4. Exit program");

            System.out.print("\nEnter the shape you want to create or 4 to exit: ");

            String choice = sc.nextLine();

            while (!choice.matches("[1234]")) {
                System.out.println("Please enter the choice correctly. Enter the shape you want to create: ");
                choice = sc.nextLine();
            }

            switch (choice.charAt(0)) {
                case '1':
                    Rectangle newRectangle = Rectangle.createRectangle();
                    System.out.printf("\nThe area of your rectangle is: %.03f\n", newRectangle.getArea());
                    System.out.printf("The perimeter of your rectangle is: %.03f\n", newRectangle.getPerimeter());
                    System.out.println();
                    break;
                case '2':
                    Square newSquare = Square.createSquare();
                    System.out.printf("\nThe area of your square is: %.03f\n", newSquare.getArea());
                    System.out.printf("The perimeter of your square is: %.03f\n", newSquare.getPerimeter());
                    System.out.println();
                    break;
                case '3':
                    Circle newCircle = Circle.createCircle();
                    System.out.printf("\nThe area of your circle is: %.03f\n", newCircle.getArea());
                    System.out.printf("The perimeter of your circle is: %.03f\n", newCircle.getPerimeter());
                    System.out.println();
                    break;
                case '4':
                    isDone = true;
            }
        } while (!isDone);


    }
}
