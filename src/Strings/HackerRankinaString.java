package Strings;

import java.io.*;

class HackerRankinaStringResult {

    /*
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String hackerrankInString(String s) {
        String target = "hackerrank";
        int targetIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target.charAt(targetIndex)) {
                targetIndex++;
            }
            if (targetIndex == target.length()) {
                return "YES";
            }
        }

        return "NO";
    }

}
class HackerRankinaString{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            String result = HackerRankinaStringResult.hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
