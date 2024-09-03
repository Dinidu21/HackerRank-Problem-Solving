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

class PlusMinusResult {

    /*
     * Complete the 'plusMinus' function below.
     *


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negCount++;
            } else if (arr[i] > 0) {
                posCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Zero count: " + zeroCount);
        System.out.println("Negative count: " + negCount);
        System.out.println("Positive count: " + posCount);

        // Convert counts to float for correct division



    }
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            if(arr.get(i)<0){
                posCount++;
            } else if (arr.get(i)>0) {
                negCount++;
            }else {
                zeroCount++;
            }
        }
        float fracPos = (float) posCount / arr.size();
        float fracNeg = (float) negCount / arr.size();
        float fracZer = (float) zeroCount / arr.size();
        System.out.printf("%2f" , fracNeg);
        System.out.printf("\n%2f" , fracPos);
        System.out.printf("\n%2f" , fracZer);

    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        PlusMinusResult.plusMinus(arr);

        bufferedReader.close();
    }
}
