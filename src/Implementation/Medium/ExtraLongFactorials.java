package Implementation.Medium;

import java.io.*;
import java.math.*;

import static java.util.stream.Collectors.joining;

class ExtraLongFactorialsResult {

    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void extraLongFactorials(int n) {
       BigInteger factorial = BigInteger.ONE;

        for (int i = 2; i <= n ; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }

}

public class ExtraLongFactorials {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        ExtraLongFactorialsResult.extraLongFactorials(n);

        bufferedReader.close();
    }
}

