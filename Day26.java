1732. Find the Highest Altitude
  class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int high=0;
        int altitude=0;
        for(int i=0; i<n;i++){
            altitude += gain[i];
            high=Math.max(altitude, high);
        }
        return high;  
    }
}
704. Binary Search
  class Solution {
    public int search(int[] nums, int target) {
       
        int n=nums.length;
        int start=0, end=n-1;
         if(n==1) return nums[0] == target ? 0:-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid]==target){
                return mid;
            }else if(nums[mid] > target){
                end =mid-1;
            }else {
                start =mid+1;
            }
        }
        return -1;

    }
}
