import java.util.*;

class Solution {
    public static List<Integer> search(String text, String pattern) {
        List<Integer> result = new ArrayList<>();

        int n = text.length();
        int m = pattern.length();

        // Try every possible starting position
        for (int i = 0; i <= n - m; i++) {
            int j;

            // Compare pattern with text starting at i
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            // If all characters matched
            if (j == m) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String text = "geeksforgeeks";
        String pattern = "geeks";

        System.out.println(search(text, pattern));
    }
}
