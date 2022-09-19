package com.algo.graph.foodFill;

public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) return image;
        fillHelper(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    public void fillHelper(int[][] image, int sr, int sc, int color, int newColor) {
        if(sr < 0
                || sc <0
                || sr >= image.length
                || sc >= image[0].length
                || image[sr][sc] != color)
            return;
        image[sr][sc] = newColor;
        fillHelper(image, sr+1, sc, color, newColor);
        fillHelper(image, sr-1, sc, color, newColor);
        fillHelper(image, sr, sc-1, color, newColor);
        fillHelper(image, sr, sc+1, color, newColor);
    }

//    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
//        int color = image[sr][sc];
//        if (color != newColor) dfs(image, sr, sc, color, newColor);
//        return image;
//    }
//    public void dfs(int[][] image, int r, int c, int color, int newColor) {
//        if (image[r][c] == color) {
//            image[r][c] = newColor;
//            if (r >= 1) dfs(image, r-1, c, color, newColor);
//            if (c >= 1) dfs(image, r, c-1, color, newColor);
//            if (r+1 < image.length) dfs(image, r+1, c, color, newColor);
//            if (c+1 < image[0].length) dfs(image, r, c+1, color, newColor);
//        }
//    }
}
