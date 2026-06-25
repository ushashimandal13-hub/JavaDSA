package assign5;
import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += Math.pow(-1, i + 1) * (2.0 * i) / (2 * i - 1);
        }

        System.out.println("Sum = " + sum);
    }
}
