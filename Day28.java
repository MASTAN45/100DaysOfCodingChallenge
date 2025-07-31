219. Contains Duplicate II
  class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}

202. Happy Number
  class Solution {
    public boolean isHappy(int n) {
        Set <Integer> seen= new HashSet<>();
        while( n!=1 && !seen.contains(n)){
            seen.add(n);
            n=getsumsq(n);
        }
        return n==1;
    }

        public int getsumsq(int n){
            int sum=0;
            while(n>0){
            int digit=n%10;
             sum +=digit *digit;
             n /=10;
            }

          return sum;
        }
        
}
