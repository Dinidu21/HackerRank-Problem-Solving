package Strings;

import java.io.*;

class MarsExplorationResult {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
        int msgCount = s.length()/3;
        String msg= "";

        for (int i = 0; i < msgCount; i++) {
            msg+="SOS";
        }

        char[] oriMsg = msg.toCharArray();
        char[] recived = s.toCharArray();
       int changedCount = 0;

        for (int i = 0; i <oriMsg.length; i++) {
            if(oriMsg[i] != recived[i]){
                    changedCount++;
            }

        }
        return changedCount;
    }
    /*
    int changedCount = 0;
    String expectedMessage = "SOS";

    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != expectedMessage.charAt(i % 3)) {
            changedCount++;
        }
    }*/

}

public class MarsExploration {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();


        int result = MarsExplorationResult.marsExploration(s);
        System.out.println(result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

