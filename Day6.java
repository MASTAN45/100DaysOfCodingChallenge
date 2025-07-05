136. Single Number
class Solution {
    public int singleNumber(int[] arr) {
        int n=arr.length;
        int b=0;
        for(int i=0; i<n; i++){
             b ^=arr[i];
        }
        return b; 
    }
}


268. Missing Number
  class Solution {
    public int missingNumber(int[] arr) {
        int n= arr.length;
        int a=0;
        int b= n*(n+1)/2;
        for(int i=0; i<n;i++){
                a +=arr[i];
        }
        return b-a;  
    }
}
