package LAB1;
public class Q4 {
	public static void main(String[] args) {
		char[] arr = {'C', 'A', 'R'};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    // ensure all indices are different
                    if (i != j && j != k && i != k) {
                        System.out.println("" + arr[i] + arr[j] + arr[k]);
                    }

                }
            }
        }
    }
}
