class Solution {
    public boolean halvesAreAlike(String s) {
        int count = 0;
        int half = s.length() / 2;

        for (int i = 0; i < half; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        for (int i = half; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count--;
            }
        }

        return count == 0;
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
