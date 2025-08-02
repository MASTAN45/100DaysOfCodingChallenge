349. Intersection of Two Arrays
  class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();
       for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result.add(nums1[i]); 
                }
            }
        }int[] output = new int[result.size()];
        int idx = 0;
        for (int num : result) {
            output[idx++] = num;
        }

        return output;

        
    }
}


12. Integer to Roman
  class Solution {
    public String intToRoman(int num) {

        int [] values={
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] symbols={
            "M" , "CM" , "D" ,"CD",
            "C", "XC" , "L" , "XL",
            "X", "IX", "V" , "IV", "I" 
        };

        StringBuilder roman = new StringBuilder();

        for(int i=0; i<values.length &&  num>0; i++){
            while(num >= values[i]){
                num -= values[i];
                roman.append(symbols[i]);
            }
        }
        return roman.toString();
       
    }
}
