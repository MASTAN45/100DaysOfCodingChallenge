74. Search a 2D Matrix
  class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        } return false;

        
    }
}

832. Flipping an Image
  class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int m=image[0].length;
        for(int i=0; i<n; i++){
            int left=0, right=m-1;
            while(left<=right){
                int a=image[i][left] ^1;
                int b=image[i][right] ^1;
                
                image[i][right]=a;
                image[i][left]=b;
                
                left++;
                right--;
            }
        }
        
        return image;

        
    }
}
