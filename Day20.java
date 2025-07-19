2652. Sum Multiples
  class Solution {
    public int sumOfMultiples(int n) {
        int sum=0; 
        for(int i=1; i<=n;i++){
            if(i%3==0||i%5==0||i%7==0){
                sum = sum+i;
            }
        }
        return sum;
    }
}

70. Climbing Stairs
  class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;

        int a=2, b=3;
        for(int i=3; i<n; i++){
            int temp=a+b;
            a=b;
            b=temp;
        } 
        return b;
    
    }
}
