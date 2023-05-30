package org.example;

import java.util.Scanner;

public class CalculateGrossWage {
    public static void main (String[] args) {
        System.out.println("How many hours did you work this week?");

        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();

        System.out.println("What is your hourly rate?");
        double hourlyRate = scanner.nextDouble();
        double totalWage = hoursWorked * hourlyRate;

        System.out.println("You have earned: $" + totalWage + " dollars.");
        scanner.close();
    }
}
