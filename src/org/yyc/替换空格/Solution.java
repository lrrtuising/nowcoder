package org.yyc.替换空格;

/**
 * Created by idea on 2017/9/30.
 */
public class Solution {
    public String replaceSpace(StringBuffer str) {
        StringBuffer rst = new StringBuffer();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char temp = str.charAt(i);
            if(temp ==' ')
                rst.append("%20");
            else
                rst.append(temp);
        }
        return rst.toString();

    }
}
