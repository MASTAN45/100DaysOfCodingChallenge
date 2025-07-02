153. Find Minimum in Rotated Sorted Array
class Solution {
    public int findMin(int[] nums) {
        int min =Integer.MAX_VALUE;
        for(int i=0; i<nums.length;i++){
            if(nums[i] < min){
                min=nums[i];
            }
        } return min;
    }
}

628. Maximum Product of Three Numbers
  class Solution {
    public int maximumProduct(int[] nums) {
        int n= nums.length;
        int prod=0;
        Arrays.sort(nums);
        int c1=nums[n-1] * nums[n-2]* nums[n-3];
        int c2 =nums[0] * nums[1] *nums[n-1];
        prod =Math.max(c1, c2);
        return prod;
    }
}
