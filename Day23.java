34. Find First and Last Position of Element in Sorted Array
  class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int start=-1, end=-1;
        
        for(int i=0; i<n; i++){
            if(nums[i]==target){
                if(start==-1) start=i;
                end=i;
            }
        } 
        return new int[]{start, end};
    }
}

167. Two Sum II - Input Array Is Sorted
  class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int sum=0;
        while(left<right){
            sum=nums[left]+nums[right];

            if(sum == target){
                return new int[]{left+1, right+1};
            }else if(sum > target){
                right--;
            }else{
                left++;
            }
        }

        return new int[]{};
        
    }
}
