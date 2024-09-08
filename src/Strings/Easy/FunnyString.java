package Strings.Easy;

import java.io.*;


class FunnyStringResult {

    /*
     * Complete the 'funnyString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

/*    public static String funnyString(String s) {
        char asciVa [] = s.toCharArray();

        int vals [] = new int [asciVa.length];

        for (int i = 0; i < asciVa.length; i++) {
            vals[i] = (int) asciVa[i];
        }

        //System.out.println("Before Reverse : "+Arrays.toString(vals));

        StringBuilder sb = new StringBuilder(s);
        String reS = String.valueOf(sb.reverse());

        int[] reversed = IntStream.range(0, vals.length)
                .map(i -> vals[vals.length - 1 - i])
                .toArray();

       // System.out.println("After Reverse : "+Arrays.toString(reversed));

        int[] news = new int [reversed.length];
        for (int i = 0; i < reversed.length-1; i++) {
            news[i] = (reversed[i+1]-reversed[i])*-1;
        }

        //System.out.println("Diff Rev : "+Arrays.toString(news));
        int[] olds = new int [asciVa.length];
        for (int i = 0; i < asciVa.length-1; i++) {
            olds[i] = (asciVa[i+1]-asciVa[i]);
        }
        ///System.out.println("Diff Ori : "+Arrays.toString(olds));

        return Arrays.equals(news, olds) ?"Funny":"Not Funny";
    }*/


    public static String funnyString(String s) {
    int n = s.length();

    for (int i = 1; i < n; i++) {
        int forwardDiff = Math.abs(s.charAt(i) - s.charAt(i - 1));
        int backwardDiff = Math.abs(s.charAt(n - i) - s.charAt(n - i - 1));

        if (forwardDiff != backwardDiff) {
            return "Not Funny";
        }
    }

    return "Funny";
}

}

public class FunnyString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            String result = FunnyStringResult.funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
/*        String s = "acxz";
        String result = FunnyStringResult.funnyString(s);
        System.out.println(result);*/


    }
}

