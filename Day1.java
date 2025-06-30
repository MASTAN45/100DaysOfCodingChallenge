121. Best Time to Buy and Sell Stock
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int buyprice=Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            if(buyprice < prices[i]){
                int profit = prices[i] - buyprice;
                maxprofit =Math.max(profit, maxprofit);
            }else{
                buyprice=prices[i];
            }
        }
        return maxprofit;
        
    }
}


42.Trapping Rain Water
class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
       int water=0, trapped=0;

       int left[]= new int [n];
       left[0]=arr[0];
       for(int i=1; i<n; i++){
        left[i]=Math.max(arr[i], left[i-1]);
       }

       int right[] = new int[n];
       right[n-1]= arr[n-1];
       for(int i=n-2; i>=0; i--){
        right[i]=Math.max(arr[i], right[i+1]);
       }
       for(int i=0; i<n; i++){
        water=Math.min(left[i], right[i]);

        trapped += water-arr[i];
       }
       return trapped;
    }      
}
