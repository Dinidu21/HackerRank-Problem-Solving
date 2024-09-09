package Strings.Hard;

import java.io.*;
import java.util.stream.IntStream;

class BuildaStringResult {

    /*
     * Complete the 'buildString' function below.
     * The function is expected to return an INTEGER.
     * The function accepts the following parameters:
     *  1. INTEGER a (cost to add a single character)
     *  2. INTEGER b (cost to copy a substring)
     *  3. STRING s (input string)
     */
    public static int buildString(int a, int b, String s) {
/*       int totalCost = 0;
       StringBuilder myString = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int maxLength = 0;
            for (int len = 1; len  <= (s.length()-i) ; len ++) {
                String currentSubString = s.substring(i,i+len);
                //System.out.print(currentSubString+ " ");
                if(myString.toString().contains(currentSubString)){
                   // System.out.println("I can Copy now.");
                    maxLength = len;
                    //System.out.println(maxLength);
                }else{
                    //System.out.println("no matching.");
                    break;
                }
            }
            // Step 4: Decide whether to add one character or copy a substring
            if (maxLength > 0 && b <= maxLength * a) {
                // Copy the longest found substring if it's cheaper
                myString.append(s, i, i + maxLength);
                totalCost += b;
                i += maxLength - 1; // Move 'i' forward to the end of copied substring
            } else {
                // Add a single character if copying is more expensive
                myString.append(s.charAt(i));
                totalCost += a;
            }
        }

        // Return the total cost after building the string
        return totalCost;
    }
*/
        StringBuilder myString = new StringBuilder();
        int totalCost = 0;

        // Iterate through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            boolean foundSubstring = false;
            int maxLength = 0;

            // Check for the longest substring starting at position i
            for (int length = 1; length <= s.length() - i; length++) {
                String substring = s.substring(i, i + length);

                // Check if this substring is already in the built string
                if (myString.toString().contains(substring)) {
                    foundSubstring = true;
                    maxLength = length;
                }
            }

            // Decide whether to copy the substring or add a single character
            if (foundSubstring && b <= maxLength * a) {
                // Copy the longest matching substring
                myString.append(s, i, i + maxLength);
                totalCost += b;
                i += maxLength - 1; // Skip the copied part
            } else {
                // Add a single character
                myString.append(s.charAt(i));
                totalCost += a;
            }
        }

       /* // Print the result and total cost
        System.out.println("Resulting String: " + myString);
        System.out.println("Total Cost: " + totalCost);*/


        return totalCost;
    }
}
public class BuildaString {
    public static void main(String[] args) throws IOException {
/*        int a = 4;
        int b = 5;
        String s = "aabaacaba";

        int result = BuildaStringResult.buildString(a, b, s);
        System.out.println(result);*/
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int a = Integer.parseInt(firstMultipleInput[1]);

                int b = Integer.parseInt(firstMultipleInput[2]);

                String s = bufferedReader.readLine();

                int result = BuildaStringResult.buildString(a, b, s);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}


