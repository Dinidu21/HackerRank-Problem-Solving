package Implementation;

import java.io.*;

class BeautifulDaysattheMoviesResult {

    /*
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */

    public static int beautifulDays(int i, int j, int k) {
        int count = 0;

        for (int l = i; l <= j; l++) {
            int original = l;
            int reversed = 0;
            int temp = l;

            while (temp != 0) {
                int digit = temp % 10;
                reversed = reversed * 10 + digit;
                temp /= 10;
            }

            int abs = Math.abs(original - reversed);
            if (abs % k == 0) {
                count++;
            }
        }

        return count;
    }
}


public class BeautifulDaysattheMovies {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = BeautifulDaysattheMoviesResult.beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

        /*int i =20;
        int j =23;
        int k = 6;
        int result = BeautifulDaysattheMoviesResult.beautifulDays(i, j, k);
        System.out.println(result);*/




    }
}

