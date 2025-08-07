3. Longest Substring Without Repeating Charactersclass Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int left=0;
        int maxLen=0;
        HashMap<Character, Integer> map= new HashMap<>();
        int right=0;

        for(right=0; right<n;right++){
            char c=s.charAt(right);
            if(map.containsKey(c)){
                left=Math.max(left , map.get(c)+1);
            }
            map.put(c, right);
            maxLen=Math.max(maxLen, right-left+1);
           
        } return maxLen;
        
    }
}


350. Intersection of Two Arrays II
  class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        boolean[] visited = new boolean[nums2.length];
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (!visited[j] && nums1[i] == nums2[j]) {
                    temp[index++] = nums1[i];
                    visited[j] = true; 
                    break;
                }
            }
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}
