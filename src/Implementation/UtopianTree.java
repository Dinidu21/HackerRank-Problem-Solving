package Implementation;

import java.io.*;
import java.util.*;

class UtopianTreeResult {

    /*
     * Complete the 'utopianTree' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int utopianTree(int n) {
        int height = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                height *= 2;
            } else {
                height += 1;
            }
        }
        return height;
    }

}

public class UtopianTree {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();  // Read the number of test cases

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();  // Read input for each test case

            int result = UtopianTreeResult.utopianTree(n);  // Call method to compute result

            System.out.println(result);  // Print the result
        }

        scanner.close();  // Close the scanner
    }
}

