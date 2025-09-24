package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // step 1:
        // Question 1:
        //Determine whose (Bob and Gary) salary is greater using Math.max()
        // and store the answer in highestSalary.

        double bobSalary, garySalary;
        double highestSalary;
        bobSalary = 50_000.90;
        garySalary = 40_000.98;
        highestSalary = Math.max(garySalary , bobSalary);
        String highestSalaryPerson;
        if(highestSalary == bobSalary) {
            highestSalaryPerson = "Bob";
        } else {
            highestSalaryPerson = "Gary";}
        System.out.println("The highest salary is $" + highestSalary + ", " + highestSalaryPerson + " have the highest salary.");


    }

}
