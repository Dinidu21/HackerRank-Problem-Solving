import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class MiniMaxSumResult {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Initialize the minVal to the maximum possible integer value
        // Initialize the maxVal to the minimum possible integer value
        long minVal = Long.MAX_VALUE;
        long maxVal = Long.MIN_VALUE;
        long totalSum = 0;

        // Loop to calculate total sum and find min and max values
        for (int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            totalSum += current;

            // Find minimum value
            if (current < minVal) {
                minVal = current;
            }

            // Find maximum value
            if (current > maxVal) {
                maxVal = current;
            }
        }

        // Minimum sum is totalSum - maxVal
        // Maximum sum is totalSum - minVal
        long minSum = totalSum - maxVal;
        long maxSum = totalSum - minVal;

        System.out.println(minSum + " " + maxSum);
    }
}


public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        MiniMaxSumResult.miniMaxSum(arr);

        bufferedReader.close();
    }
}
