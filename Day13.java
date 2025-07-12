867. Transpose Matrix
  class Solution {
    public int[][] transpose(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int re[][]=new int[m][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){ 
                re[j][i] = matrix[i][j];
            }
        }
        return re;
        
    }
}

1572. Matrix Diagonal Sum
  class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum +=mat[i][i];

            if(i!=n-1-i){   
               sum+=mat[i][n-1-i];
            }

        }
        return sum;
       
    }
}
