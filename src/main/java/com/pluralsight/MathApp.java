package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // step 1:
        // Question 1:
        double bobSalary, garySalary;
        double highestSalary;
        double Bob, Gary;
        bobSalary = 50_000;
        garySalary = 60_000;
        Bob = bobSalary;
        Gary = garySalary;
        highestSalary = Math.max(bobSalary,garySalary);

        System.out.println("The highest salary is " + highestSalary);

    }

}
