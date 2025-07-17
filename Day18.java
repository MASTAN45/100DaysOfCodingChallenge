283. Move Zeroes
  class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=0;
        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                nums[j]=nums[i];
                j++;
            }
        }
        while(j<n){
            nums[j]=0;
            j++;
        }    
        
    }
}

179. Largest Number
  class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String[] str=new String[n];

        for(int i=0; i<n; i++ ){
            str[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(str, (a,b) -> (b+a).compareTo(a+b));

        if(str[0].equals("0")) return "0";

        StringBuilder result= new StringBuilder();

        for(String s : str){
            result.append(s);
        }
        return result.toString();

    }
}
