217. Contains Duplicate
  class Solution {
    public boolean containsDuplicate(int[] nums) {
       int n=nums.length;
       HashSet<Integer> set= new HashSet<>();

       for(int i=0; i<n; i++){
          if(set.contains(nums[i])){
            return true;
          }else{
            set.add(nums[i]);
          }
        }

        return false;
        
    }
}

215. Kth Largest Element in an Array
  class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k]; 
        
    }
}
