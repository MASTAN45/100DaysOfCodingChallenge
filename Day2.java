53. Maximum Subarray
class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int cs=0;
        int max=nums[0];
        for(int i=0; i<n; i++){
            cs =Math.max(nums[i] , cs+nums[i]);
            max=Math.max(cs , max);
            
        }
            
        return max;  
    }
}

1929. Concatenation of Array
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[] = new int[2*n];
        
        for(int i=0; i<n;i++){
            ans[i] =nums[i];
        } for(int i=0; i<n; i++){
            ans[i+n]=nums[i];
        }
        return ans;
        
    }
}
