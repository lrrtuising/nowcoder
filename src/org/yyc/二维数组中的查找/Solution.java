package org.yyc.二维数组中的查找;

/**
 * Created by idea on 2017/9/30.
 */
public class Solution {
    public boolean Find(int target, int[][] array) {
        int row = array.length;
        int col = array[0].length;
        int i = row-1, j = 0;
        while (i >= 0 && j < col)
        {
            if (target>array[i][j])
                j++;
            else if (target<array[i][j])
                i--;
            else
                return true;
        }
            return false;
    }
}
