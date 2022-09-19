package com.algo.graph.numOfIsland;

public class Solution {    public int numIslands(char[][] grid) {
    int num = 0;

    for (int i = 0; i<grid.length; i++) {
        for (int j = 0; j<grid[0].length; j++) {
            if (grid[i][j] == '1') {
                num++;
                helper(grid, i, j);
            }
        }
    }
    return num;
}

    public void helper(char[][] grid, int r, int c){
        if (grid[r][c] == '1') {
            grid[r][c] = '0';

            if (r > 0) helper(grid, r-1, c);
            if (c > 0) helper(grid, r, c-1);
            if (r < grid.length - 1) helper(grid, r+1, c);
            if (c < grid[0].length - 1) helper(grid, r, c+1);

        }
    }

}
