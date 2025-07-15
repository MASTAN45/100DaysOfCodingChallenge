48. Rotate Image
  class Solution {
    public void rotate(int[][] arr) {
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp=arr[i][n-1-j];
                arr[i][n-1-j]=arr[i][j];
                arr[i][j]=temp;
            }
        }
        
    }
}

9. Palindrome Number
  class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int a=x;
        int rem=0, rev=0;
        while(x>0){
            rem=x%10;
            rev =rev*10 +rem;
            x/=10;
        } return rev==a;
        
        
    }
}
