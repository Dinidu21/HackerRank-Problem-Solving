package Strings.Easy;


import java.io.*;
import java.util.*;


class MakingAnagramsResult {

        /*
         * Complete the 'makingAnagrams' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. STRING s1
         *  2. STRING s2
         */

        public static int makingAnagrams(String s1, String s2) {
           /* int sameCount = 1;

            char [] ch = s1.toCharArray();
            char [] ch2 = s2.toCharArray();
            System.out.println(Arrays.toString(ch));
            System.out.println(Arrays.toString(ch2));
       L1:    for (int i = 0; i < ch2.length; i++) {
          L2:    for (int j = i; j < ch2.length; j++) {
                    if(ch[i] == ch2[j]){
                        sameCount++;
                        return (s1.length()+s2.length())-sameCount;
                    }
                }
                Math.abs();
            }
            return  (s1.length()+s2.length())-sameCount;
        }
*/
            // Initialize frequency arrays for both strings
            int[] freq1 = new int[26]; // For characters in s1
            int[] freq2 = new int[26]; // For characters in s2

            for (char c : s1.toCharArray()) {
                freq1[c - 'a']++;
            }

            System.out.println(Arrays.toString(freq1));

            for (char c : s2.toCharArray()) {
                freq2[c - 'a']++;
            }

            System.out.println(Arrays.toString(freq2));

            int deletions = 0;
            for (int i = 0; i < 26; i++) {
                deletions += Math.abs(freq1[i] - freq2[i]);
               System.out.println(deletions);

            }

            return -1;
        }

    }

    public class MakingAnagrams {
        public static void main(String[] args) throws IOException {
/*            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String s1 = bufferedReader.readLine();

            String s2 = bufferedReader.readLine();*/
            String s1 = "absdjkvuahdakejfnfauhdsaavasdlkj";
            String s2 = "djfladfhiawasdkjvalskufhafablsdkashlahdfa";

            int result = MakingAnagramsResult.makingAnagrams(s1, s2);
            System.out.println(result);

   /*         bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();*/
        }
    }


