152. Maximum Product Subarray
  class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int current=nums[0];
        int max=nums[0];
        int min=nums[0];
        int result=nums[0];
        for(int i=1; i<n; i++){
            current=nums[i];

            int temp=Math.max(current, Math.max(min*current, max*current));
            min=Math.min(current, Math.min(current*max, current*min));
            max=temp;
            result=Math.max(max,result);
            
        }
       
        return result;
        
    }
}

88. Merge Sorted Array
  class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i<n; i++){
            nums1[m+i]=nums2[i];
        } Arrays.sort(nums1);
        
    }
}
