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

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        boolean isPM= s.endsWith("PM");

        String [] timeParts = s.substring(0,8).split(":");
        int hours = Integer.parseInt(timeParts[0]);
        String mins = timeParts[1];
        String secs= timeParts[2];


        if(isPM){
            if(hours!=12){
                hours+=12;
            }

        }else{
            if(hours==12){
                hours =0;
            }
        }
        String hrsFormat = String.format("%02d",hours);
        return hrsFormat + ":" + mins + ":" + secs;
    }

}

public class TimeConversion{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String s = bufferedReader.readLine();
        String result = Result.timeConversion(s);
        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
