344. Reverse String
  class Solution {
    public void reverseString(char[] s) {
        int i=0; 
        int j=s.length-1;

        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }

        
    }
}

28. Find the Index of the First Occurrence in a String
  class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() ==1 && needle.length()==1) return 0;
        int n=haystack.length();
        int m=needle.length();

        for(int i=0; i<=n-m; i++){
            int j=0;
            for(j=0; j<m; j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
            }
            if(j==m){
                return i;
            }
        } 
        
        return -1;
    }
}
