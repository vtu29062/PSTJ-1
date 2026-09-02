import java.util.*;

class Result {

    public static List<Integer> maxSubarray(List<Integer> arr) {
        // Maximum subarray sum - Kadane's algorithm
        int currentSum = arr.get(0);
        int maxSubarray = arr.get(0);

        // Maximum subsequence sum
        int maxSubsequence = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            int value = arr.get(i);

            // Kadane's algorithm
            currentSum = Math.max(value, currentSum + value);
            maxSubarray = Math.max(maxSubarray, currentSum);

            // For subsequence, take all positive values
            // and keep the largest value if all are negative
            if (value > 0) {
                maxSubsequence += value;
            } else {
                maxSubsequence = Math.max(maxSubsequence, value);
            }
        }

        return Arrays.asList(maxSubarray, maxSubsequence);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }

            List<Integer> result = Result.maxSubarray(arr);

            System.out.println(result.get(0) + " " + result.get(1));
        }

        sc.close();
    }
}
