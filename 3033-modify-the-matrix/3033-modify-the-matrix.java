class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        

        for(int i=0; i<cols; i++){
            int max = Integer.MIN_VALUE;

            for(int j=0; j<rows; j++){
                max = Math.max(max, matrix[j][i]);
            }

            for(int j=0; j<rows; j++){
                if(matrix[j][i] == -1){
                    matrix[j][i] = max;
                }
            }
        }
        return matrix;
    }
}