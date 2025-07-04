35. Search Insert Position
  class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int s=0, end=n-1;
        int mid=0;
        while(s<=end){
            mid= s+ (end-s)/2;
                if(nums[mid]==target){
                    return mid;
                }else if(nums[mid] > target) {
                     end = mid-1;
                }else {
                     s=mid+1;
                }
            
        } return s;
       
    }
}

27. Remove Element
  class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int k=0;

        for(int i=0; i<n; i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        } 
        return k; 
    }
}
