package Implementation;

import java.util.*;

class PickingNumbersResult {
    public static int pickingNumbers(List<Integer> a) {
        int[] frequency = new int[101];

        for (int num : a) {
            frequency[num]++;
        }

        int maxLength = 0;

        // Find the maximum number of integers where the difference between them is <= 1
        for (int i = 1; i < frequency.length - 1; i++) {
            int currentLength = frequency[i] + frequency[i + 1];
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}

public class PickingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();  // Reading the size of the list
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());  // Reading each element of the list
        }

        int result = PickingNumbersResult.pickingNumbers(a);
        System.out.println(result);  // Output the result

        scanner.close();
    }
}

