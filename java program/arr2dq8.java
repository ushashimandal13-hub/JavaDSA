import java.util.Scanner;
class Dsa1{
	public static void main(String[]args){
	 
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        // Input dimensions
        System.out.print("Enter number of Row and Columns of 2D-Array: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        // Input elements and calculate sum
        System.out.println("Enter elements of 2D-Array: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }

        // Print array
        System.out.println("The elements of 2D array are:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The sum of elements of the 2D-Array is " + sum);
    }
}
