1480. Running Sum of 1d Array
class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int arr[] = new int[n];
        int sum=0;
        for(int i=0; i<n; i++){
            sum +=nums[i];
            arr[i]= sum;
        }
        return arr;
    }
}



1619. Mean of Array After Removing Some Elements
class Solution {
    public double trimMean(int[] arr) {
        int n=arr.length;
        double sum=0.0;
        Arrays.sort(arr);
        int k= n*5/100;
        for(int i=k;i<n -k;i++){
            sum +=arr[i];
        }
        return sum / (n-2 *k);
        
    }
}
