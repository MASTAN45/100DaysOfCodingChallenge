724. Find Pivot Index
  class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int totalsum=0;

        for(int i=0; i<n; i++){
            totalsum += nums[i];
        }  
        int leftsum=0;
        for(int i=0; i<n; i++){
            if(leftsum == totalsum -leftsum - nums[i]){
                return i;
            }else {
                leftsum+=nums[i];
            } 
        }

        return -1;
    }
}

560. Subarray Sum Equals K
  class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        int sum=0;
        for(int i=0; i<n; i++){
            sum=0;
            for(int j=i; j<n; j++){
                sum+=nums[j];
                if(sum==k){
                  count++;
                }
                
            }
        }
        return count;
    }
}
