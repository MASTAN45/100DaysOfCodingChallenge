2739. Total Distance Traveled
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int maxdistance=0;
        while(mainTank >=5 && additionalTank>0){
            maxdistance +=50;
           mainTank=(mainTank-5)+1;
           additionalTank--;
        } 
        maxdistance +=mainTank*10;
        return maxdistance;
    
    }
}

1137. N-th Tribonacci Number
class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        int n1=0, n2=1, n3=1, n4=0;
        for(int i=3; i<=n; i++){
            n4=n1+n2+n3;
            n1=n2;
            n2=n3;
            n3=n4;
        }
        return n3;

    }
}
       
