66. Plus One
class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int arr[] = new int [n+1];
        for(int i=n-1; i>=0; i--){
            if(digits[i] <9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;

        }
        arr[0]=1;
        return arr;
    }
}

26. Remove Duplicates from Sorted Array
  class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int j=1;
        for(int i=1; i<n; i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;

        
    }
}
