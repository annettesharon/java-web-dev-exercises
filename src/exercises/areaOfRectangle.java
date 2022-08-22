package exercises;

import java.util.Scanner;

public class areaOfRectangle {
        public static void main(String[] args) {
            Scanner inputLength = new Scanner(System.in);
            System.out.println("Enter the length of the Rectangle: ");
            double length = inputLength.nextDouble();
            System.out.println("Enter the width of the Rectangle: ");
            double width = inputLength.nextDouble();
            System.out.println("The area of the rectangle is " + length*width);
        }

    }
