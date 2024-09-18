import java.io.*;
import java.util.*;

class PasswordDecryptionResult {

    /*
     * Complete the 'decryptPassword' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String decryptPassword(String s) {
        StringBuilder original = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        int n = s.length();

        // Collect digits first (but we'll use them in reverse order)
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(s.charAt(i)) && s.charAt(i) != '0') {
                digits.append(s.charAt(i));
            }
        }

        // Now process the string from left to right
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                // Replace '0' with the last digit from the digits list
                original.append(digits.charAt(digits.length() - 1));
                digits.deleteCharAt(digits.length() - 1);  // Remove the used digit
            } else if (i + 2 < n && s.charAt(i + 2) == '*') {
                // Swap the lowercase and uppercase pair
                original.append(s.charAt(i + 1)).append(s.charAt(i));
                i += 2;  // Skip the swapped characters and the '*'
            } else if (!Character.isDigit(s.charAt(i))) {
                // Append any other characters as-is (excluding digits and '0')
                original.append(s.charAt(i));
            }
        }
        return original.toString();
    }

}

public class PasswordDecryption {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
/*        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = PasswordDecryptionResult.decryptPassword(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
        System.out.print("Enter Encrypted Password : ");
        String result = PasswordDecryptionResult.decryptPassword(sc.nextLine()); //51Pa*0Lp*0e
        System.out.println("Decrypted Password :"+result);

    }
}
