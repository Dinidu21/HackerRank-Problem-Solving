package Implementation;

import java.io.*;
import java.util.*;

class BreakingTheRecordsResult {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
            List <Integer> finals = new ArrayList<>();
            int maxScore = scores.get(0);
            int minScore = scores.get(0);
            int maxcount = 0;
            int mincount = 0;

        for(int  n : scores){
            if(maxScore < scores.get(n)){
                maxScore = scores.get(n);
                maxcount++;
            }else if (minScore > scores.get(n)){
                minScore = scores.get(n);
                mincount++;
            }
        }

        /*System.out.println("min Score : "+minScore);
        System.out.println("min Count : "+mincount);

        System.out.println("\nmax Score : "+maxScore);
        System.out.println("max Count : "+maxcount);*/


        finals.add(maxcount);
        finals.add(mincount);
            return finals;
    }

}

public class BreakingTheRecords {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] scoresTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

       List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresTemp[i]);
            scores.add(scoresItem);
        }

        List<Integer> result = BreakingTheRecordsResult.breakingRecords(scores);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

       /* List <Integer> scores = Arrays.asList(10, 5,20,20,4,5,2,25,1);
       // System.out.println(scores);
        List<Integer> result = BreakingTheRecordsResult.breakingRecords(scores);
        //result.forEach(e -> System.out.print(e + " "));*/

    }
}

