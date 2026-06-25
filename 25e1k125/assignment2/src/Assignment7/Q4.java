package Assignment7;
import java.util.*;
public class Q4 {

    public static double min(double[] array) {
        double minValue = array[0];          // start with first element
        for (double num : array) {           // enhanced for-loop
            if (num < minValue) minValue = num;
        }
        return minValue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter ten numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextDouble();
        }

        double minNumber = min(numbers);
        System.out.println("The minimum number is: " + minNumber);

        sc.close();
    }
}

