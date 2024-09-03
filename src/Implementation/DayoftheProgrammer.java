package Implementation;

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

class DayoftheProgrammerResult {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
        // Julian calendar leap year: divisible by 4
        if (year >= 1700 && year <= 1917) {
            if (year % 4 == 0) {
                return "12.09." + year;  // Leap year in Julian calendar
            } else {
                return "13.09." + year;  // Non-leap year in Julian calendar
            }
        }

        // Transition year 1918
        else if (year == 1918) {
            return "26.09.1918";  // Special case: February 14th was the 32nd day of the year
        }

        // Gregorian calendar leap year: divisible by 400 or divisible by 4 but not by 100
        else {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                return "12.09." + year;  // Leap year in Gregorian calendar
            } else {
                return "13.09." + year;  // Non-leap year in Gregorian calendar
            }
        }
    }
}


public class DayoftheProgrammer {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = DayoftheProgrammerResult.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

