import java.util.Scanner;

public class SimpleCalculator {

    
    public static int additionSimple(int x, int y) {
        return x + y;
    }

    public static int subtractionSimple(int x, int y) {
        return y - x;
    }

    public static int multiplicationSimple(int x, int y) {
        return x * y;
    }

    public static double divisionSimple(int x, int y) {
        if (x == 0) {
            return -1; // special error value
        }
        return (double) y / x;
    }

    public static int remainderSimple(int n, int m) {
        return n % m;
    }

    public static double squareRootSimple(int n) {
        if (n < 0) {
            return -1; // special error value
        }
        return Math.sqrt(n);
    }

    // --- Main Program ---
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----- SIMPLE CALCULATOR -----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. Square Root");
            System.out.println("7. Exit");

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 7) {
                System.out.println("Exiting... Thank you!");
                break;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter first number (x): ");
                    int x1 = sc.nextInt();
                    System.out.print("Enter second number (y): ");
                    int y1 = sc.nextInt();
                    System.out.println("Result (x + y) = " + additionSimple(x1, y1));
                    break;

                case 2:
                    System.out.print("Enter first number (x): ");
                    int x2 = sc.nextInt();
                    System.out.print("Enter second number (y): ");
                    int y2 = sc.nextInt();
                    System.out.println("Result (y - x) = " + subtractionSimple(x2, y2));
                    break;

                case 3:
                    System.out.print("Enter first number (x): ");
                    int x3 = sc.nextInt();
                    System.out.print("Enter second number (y): ");
                    int y3 = sc.nextInt();
                    System.out.println("Result (x * y) = " + multiplicationSimple(x3, y3));
                    break;

                case 4:
                    System.out.print("Enter first number (x): ");
                    int x4 = sc.nextInt();
                    System.out.print("Enter second number (y): ");
                    int y4 = sc.nextInt();
                    double result = divisionSimple(x4, y4);
                    if (result == -1) {
                        System.out.println("Error! Division by zero is not allowed.");
                    } else {
                        System.out.println("Result (y / x) = " + result);
                    }
                    break;

                case 5:
                    System.out.print("Enter first number (n): ");
                    int n = sc.nextInt();
                    System.out.print("Enter second number (m): ");
                    int m = sc.nextInt();
                    System.out.println("Result (n % m) = " + remainderSimple(n, m));
                    break;

                case 6:
                    System.out.print("Enter number for square root: ");
                    int sr = sc.nextInt();
                    double sq = squareRootSimple(sr);
                    if (sq == -1) {
                        System.out.println("Error! Square root of a negative number is not allowed.");
                    } else {
                        System.out.println("Result = " + sq);
                    }
                    break;

                default:
                    System.out.println("Invalid Option! Try again.");
            }
            System.out.println();
        }

        sc.close();
    }
}