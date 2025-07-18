56. Merge Intervals
  import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;

        if(n==0) return new int[0][0];

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int result[][] = new int[n][2];
        result[0]=intervals[0];
        int idx=0;

        for(int i=1; i<n; i++){
            int last[] = result[idx];
            int curr[]=intervals[i];

            if(last[1] >= curr[0]){
              last[1]=Math.max(last[1], curr[1]);
           }else {
              idx++;
              result[idx]=curr;
            }
        }

        return Arrays.copyOf(result, idx+1);
    }
}

73. Set Matrix Zeroes
  class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean fr = false, fc = false;

        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) fc = true;
        }

        for (int j = 0; j < m; j++) {
            if (matrix[0][j] == 0) fr = true;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        
        if (fc) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }

        if (fr) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }
    }
}
