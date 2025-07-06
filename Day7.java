1. Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] + nums[j] == target){
                   return new int []{i,j};
                }
            }
        }
        return new int []{-1-1};
         
    }
} 

33. Search in Rotated Sorted Array
class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
        
    }
}
