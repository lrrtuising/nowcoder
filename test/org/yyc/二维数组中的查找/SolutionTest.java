package org.yyc.二维数组中的查找;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by idea on 2017/9/30.
 */
public class SolutionTest {
    @Test
    public void find() throws Exception {
        int b = 4;
        int[][] c = new int[2][3];
        boolean d;
        c[0] =new int[]{1,2,3};
        c[1] = new int[]{4,5,6};
        Solution a = new Solution();
        d = a.Find(b,c);
        System.out.println(d);
    }

}