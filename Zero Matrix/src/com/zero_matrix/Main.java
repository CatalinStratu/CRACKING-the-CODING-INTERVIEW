package com.zero_matrix;

public class Main {
    public static int[][] zero_matrix(int[][] matrix){
        for(int i =0; i<matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    for(int k=0; k<matrix.length;k++) {
                        matrix[k][j] = 0;
                    }
                }
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
	    // write your code here
        int[][] matrix = {{1,2,0},{1,0,3},{0,1,4}};
        zero_matrix(matrix);
        for (int i = 0; i < matrix.length; i++)
        {
            // length returns number of rows
            System.out.print("row " +  i + " : ");
            for (int j = 0; j < matrix[i].length; j++)
            {
                // here length returns # of columns corresponding to current row
                System.out.print("col " +  matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
