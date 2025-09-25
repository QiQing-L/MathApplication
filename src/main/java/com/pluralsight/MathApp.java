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
        double x1 = 5;
        double x2 = 85;
        double y1 = 10;
        double y2 = 50;
        double dForx = Math.pow((x1 - x2), 2);
        double dFory = Math.pow((y1 - y2), 2);
        double distance = Math.sqrt(dForx + dFory);
        System.out.println("The distance between the points (5, 10) and (85, 50) is " + distance + ".");

        // Question 6:
        //Find and display the absolute (positive) value of a variable after it is set to -3.8
        // abs(x) : Returns the absolute value of x
        double num1 = -3.8;
        System.out.println("The absolute (positive) value of " + num1 + " is " + Math.abs(num1) + ".");

        // Question 7:
        // Find and display a random number between 0 and 1
        // found random(): Returns a random number between 0 and 1, works on doubles.
        double ranNum = Math.random();
        System.out.println("Here will display a random number between 0 and 1: " + ranNum);


        // Question 8:
        // Calculate how many minutes are in 24 days, use a variable for each value you
        //calculate with. BONUS: How many milliseconds?
        final int minInHr = 60;
        final int hourInDay = 24;
        final int secInMin = 60;
        final int millSecInSec = 1000;
        long numOfDays = 24;
        long totalMinInDays = (minInHr * hourInDay * numOfDays);
        long totalMillSecInDays = (totalMinInDays * secInMin * millSecInSec);
        System.out.println("There are " + totalMinInDays + " minutes in " + numOfDays + " days, and "
                + totalMillSecInDays + " milliseconds in " + numOfDays + " days.");




    }

}
