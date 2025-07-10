2815. Max Pair Sum in an Array
class Solution {
    public int maxSum(int[] nums) {
        int n=nums.length;
        int maxsum=-1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int m1=getmax(nums[i]);
                int m2=getmax(nums[j]);
                if(m1==m2){
                    maxsum=Math.max(maxsum, nums[i]+nums[j]);
                }  
            }
        }
        return maxsum;
   
    }

    public static int getmax(int num){
        int max=0;
        while(num>0){
        max=Math.max(max, num%10);
        num /=10;
        }
        return max;
    } 
}

69. Sqrt(x)
class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int left=1, right=x/2, ans=1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid <=x/mid ){
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
        
    }
}
