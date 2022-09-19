package com.algo.dynamicProgramming.uniquePath;

public class Solution {
    public int uniquePaths(int m, int n) {
        if(m==0 || n==0) return 0;
        if(m==1 || n==1) return 1;

        int[][] table = new int[m][n];

        //right column
        for(int i=0; i<m; i++){
            table[i][n-1] = 1;
        }

        //bottom row
        for(int j=0; j<n; j++){
            table[m-1][j] = 1;
        }

        for(int i=m-2; i>=0; i--){
            for(int j=n-2; j>=0; j--){
                table[i][j] = table[i+1][j] + table[i][j+1];
            }
        }

        return table[0][0];
    }
}
