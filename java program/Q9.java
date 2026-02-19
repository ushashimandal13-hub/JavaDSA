import java.util.Scanner;

class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            double term = (double) (2 * i) / (2 * i - 1);
            if (i % 2 == 0) {
                sum -= term;
            } else {
                sum += term;
            }
        }

        System.out.println("Sum = " + sum);
        scanner.close();
    }
}

