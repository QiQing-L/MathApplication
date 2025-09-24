package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // step 1:
        // Question 1:
        //Determine whose (Bob or Gary) salary is greater using Math.max()
        // and store the answer in highestSalary.
        double bobSalary, garySalary;
        double highestSalary;
        bobSalary = 30_000.90;
        garySalary = 40_000.98;
        highestSalary = Math.max(garySalary , bobSalary);
        String highestSalaryPerson;
        if(highestSalary == bobSalary) {
            highestSalaryPerson = "Bob";
        } else {
            highestSalaryPerson = "Gary";}
        System.out.println("The highest salary is $" + highestSalary + ", " + highestSalaryPerson + " have the highest salary.");

        // Question 2:
        //Find and display the smallest of two variables named carPrice and
        //truckPrice. Set the variables to any value you want.
        double carPrice, truckPrice;
        carPrice = 80_000;
        truckPrice = 100_000;
        double smallestPrice;
        smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The smallest price is $" + smallestPrice + ".");

        //Question 3:
        // Find and display the area of a circle whose radius is 7.25.
        double radius = 7.25;
        double radiusSquare = Math.pow(radius,2);
        double area = Math.PI * radiusSquare;
        System.out.println("The area of the circle is " + area + ".");

        // Question 4:
        //Find and display the square root a variable after it is set to 5.0
        double number1 = 5.0;
        double number1SqRoot =Math.sqrt(number1);
        System.out.println("The square root of " + number1 + " is " + number1SqRoot + ".");

        // Question 5:
        //Find and display the distance between the points (5, 10) and (85, 50)
        //Distance Formula: d = √[(x₂ - x₁)² + (y₂ - y₁)²]


    }

}
