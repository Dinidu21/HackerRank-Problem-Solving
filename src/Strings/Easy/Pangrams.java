package Strings.Easy;

import java.io.*;


class PangramsResult {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        String givenString = s.replaceAll(" ", "").toLowerCase();

        int[] freq = new int [26];

        for (char c :givenString.toCharArray()){
            freq [c - 'a']++;
        }
        for (int n : freq){
            if(n ==0){
                return "not pangram";
            }
        }
        return "pangram";




    }
}


public class Pangrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();
        //String s = "We promptly judged antique ivory buckles for the prize";
        String result = PangramsResult.pangrams(s);
        System.out.println(result);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

