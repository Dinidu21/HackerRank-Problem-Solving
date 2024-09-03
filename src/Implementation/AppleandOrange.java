package Implementation;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

class AppleandOrangeResult {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Count apples falling on Sam's house
        int applesOnHouse = 0;
        for (int apple : apples) {
            int landingPosition = a + apple;
            if (landingPosition >= s && landingPosition <= t) {
                applesOnHouse++;
            }
        }

        // Count oranges falling on Sam's house
        int orangesOnHouse = 0;
        for (int orange : oranges) {
            int landingPosition = b + orange;
            if (landingPosition >= s && landingPosition <= t) {
                orangesOnHouse++;
            }
        }

        // Print the results
        System.out.println(applesOnHouse);
        System.out.println(orangesOnHouse);
    }
}

public class AppleandOrange {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);
        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);
        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);
        int n = Integer.parseInt(thirdMultipleInput[1]);

        List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        AppleandOrangeResult.countApplesAndOranges(s, t, a, b, apples, oranges);

        bufferedReader.close();
    }
}

