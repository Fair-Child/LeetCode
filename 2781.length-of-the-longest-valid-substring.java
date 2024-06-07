class Solution {
    public int longestValidSubstring(String word, List<String> forbidden) {
        int len = 0;
        Set<String> set = new HashSet<>(forbidden);
        for (String s : forbidden) {
            len = Math.max(len, s.length());
        }

        int end = word.length();
        int longest = 0;

        for (int i = word.length() - 1; i >= 0; i--) {
            for (int j = i + 1; j <= end && j - i <= len; j++) {
                String sub = word.substring(i, j);
                if (set.contains(sub)) {
                    end = j - 1;
                    break;
                }
            }
            longest = Math.max(longest, end - i);
        }
        return longest;
    }
}