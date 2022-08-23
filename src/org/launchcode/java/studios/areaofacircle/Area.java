package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Enter the radius of the circle: ");
        Double r = input.nextDouble();
        if(r.isNaN()||r<0||r.toString()=="") {
            //Double area = pi*r*r;
            System.out.println("Enter a valid radius of the circle: ");
            r= input.nextDouble();
        }
        Double area = Circle.getArea(r);
        System.out.println("The area of a circle of radius " + r + " is: " + area);
        input.close();
    }

}
