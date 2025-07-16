
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
