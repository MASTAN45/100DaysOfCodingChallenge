238. Product of Array Except Self
  class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prefix[] = new int[n];
        prefix[0]=1;
        for(int i=1; i<n; i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        int suffix=1;
        for(int i=n-1; i>=0; i--){
            prefix[i]=prefix[i]*suffix;
            suffix=suffix*nums[i];
        }
        return prefix;
    }
}

189. Rotate Array
class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        int arr[] = new int[n];
        k=k % n;

        for(int i=0; i<n;i++){
            arr[(i+k)%n]=nums[i];
        }

        for(int i=0; i<n; i++){
            nums[i]=arr[i];
        }
        
    }
}
