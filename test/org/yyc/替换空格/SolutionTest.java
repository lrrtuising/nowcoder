package org.yyc.替换空格;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by idea on 2017/9/30.
 */
public class SolutionTest {
    @Test
    public void replaceSpace() throws Exception {
        StringBuffer str1 = new StringBuffer("We Are Happy");
        Solution a = new Solution();
        String str2 = a.replaceSpace(str1);
        System.out.println(str2);
    }

}