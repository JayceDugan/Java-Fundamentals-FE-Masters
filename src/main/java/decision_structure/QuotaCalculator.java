package decision_structure;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;

        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int salesMade = scanner.nextInt();

        if (salesMade < quota) {
            int salesNeededToMeetQuota = quota - salesMade;

            System.out.println("Argh, you needed " + salesNeededToMeetQuota + " more sales this week to meet the quota, better luck next week!");
        } else {
            System.out.println("Superstar salesman, well done.");
        }

        scanner.close();
    }
}
