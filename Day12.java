
81. Search in Rotated Sorted Array II
  class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n; i++){
            if(nums[i]==target){
                return true;
            }
        } 
        return false;

        
    }
}


4. Median of Two Sorted Arrays
  class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int arr[] =new int[n+m];
        
        for(int i=0; i<n; i++){
            arr[i]=nums1[i];

        }
        for(int i=0; i<m; i++){
            arr[n+i]=nums2[i];
        }

        Arrays.sort(arr);

        int total=n+m;

        if(total%2==0){
            return (arr[total/2] + arr[(total/2)-1])/2.0;
        }else{
            return arr[total/2];

        }

    }
}
