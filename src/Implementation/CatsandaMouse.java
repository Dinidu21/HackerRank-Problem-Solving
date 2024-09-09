package Implementation;

import java.io.*;
import java.util.*;


public class CatsandaMouse {

    static String catAndMouse(int x, int y, int z) {
        int catA = Math.abs(z-x);
        int catB = Math.abs(z-y);
        if (catA == catB) {
            return "Mouse C";
        } else if (catA < catB) {
            return "Cat A";
        }else{
            return "Cat B";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
/*        int x = 1 ;
        int y = 10;
        int z = 5;
        String result = catAndMouse(x, y, z);
        System.out.println(result);*/
    }
}
