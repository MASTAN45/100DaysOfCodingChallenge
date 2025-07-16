Find Duplicate Number
class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        HashSet <Integer> hs=new HashSet<>();
        for (int i = 0; i < n; i++) {
            if(hs.contains(nums[i])){
                return nums[i];
            }else{
               hs.add(nums[i]);
            }
           
        }
        return -1;

    }
}

3046. Split the Array
import java.util.HashMap;

class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > 2) {
                return false; 
            }
        }

        return true;
    }
}
