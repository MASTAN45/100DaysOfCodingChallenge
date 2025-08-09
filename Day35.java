125. Valid Palindrome
  class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) return true;
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }
        String t = cleaned.toString();
        int i = 0, j = t.length() - 1;
        while (i < j) {
            if (t.charAt(i) != t.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

151. Reverse Words in a String
  class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i=words.length-1; i >=0; i--){
            ans.append(words[i]);
            if(i>0) ans.append(' ');
            
        }
        return ans.toString();

    }
}
