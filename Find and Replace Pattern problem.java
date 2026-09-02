import java.util.*;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (matches(word, pattern)) {
                result.add(word);
            }
        }

        return result;
    }

    private boolean matches(String word, String pattern) {
        char[] pToW = new char[26];
        char[] wToP = new char[26];

        Arrays.fill(pToW, '#');
        Arrays.fill(wToP, '#');

        for (int i = 0; i < pattern.length(); i++) {
            int p = pattern.charAt(i) - 'a';
            int w = word.charAt(i) - 'a';

            // Pattern -> Word
            if (pToW[p] != '#' && pToW[p] != word.charAt(i)) {
                return false;
            }

            // Word -> Pattern
            if (wToP[w] != '#' && wToP[w] != pattern.charAt(i)) {
                return false;
            }

            pToW[p] = word.charAt(i);
            wToP[w] = pattern.charAt(i);
        }

        return true;
    }
}
