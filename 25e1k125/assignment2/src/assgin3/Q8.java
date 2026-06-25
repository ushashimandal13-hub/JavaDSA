package assgin3;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = sc.nextInt();
        double billAmount = 0.0;

        // Calculate bill using nested if-else
        if (units <= 50) {
            billAmount = units * 4.80;
        } else if (units <= 200) {
            billAmount = (50 * 4.80) + (units - 50) * 5.80;
        } else if (units <= 400) {
            billAmount = (50 * 4.80) + (150 * 5.80) + (units - 200) * 6.20;
        } else {
            billAmount = (50 * 4.80) + (150 * 5.80) + (200 * 6.20) + (units - 400) * 7.00;
        }
        System.out.print("Do you want to pay your bill online? (Y/N): ");
       
        sc.nextLine();
        String payOnline = sc.nextLine().trim();

        double discount = 0.0;
        double amountPayable = billAmount;

        if (payOnline.equalsIgnoreCase("Y")) {
            discount = billAmount * 0.03;
            amountPayable = billAmount - discount;
            System.out.printf("You received a 3%% online payment discount of Rs. %.2f%n", discount);
        } else if (payOnline.equalsIgnoreCase("N")) {
            // no discount, just show normal bill
        } else {
            System.out.println("Invalid input for online payment option. No discount applied.");
        }

        System.out.printf("Total Electricity Bill: Rs. %.2f%n", billAmount);
        System.out.printf("Amount Payable: Rs. %.2f%n", amountPayable);

        sc.close();
    }
}


