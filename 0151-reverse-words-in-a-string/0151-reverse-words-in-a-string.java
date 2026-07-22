class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); 
        StringBuilder joined = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            joined.append(words[i]);
            if (i > 0) {
                joined.append(" ");
            }
        }

        return joined.toString();
    }
}
