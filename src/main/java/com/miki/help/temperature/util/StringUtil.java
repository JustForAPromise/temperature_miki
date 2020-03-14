package com.miki.help.temperature.util;

public class StringUtil {
    private final static String VERIFY_STRING = "0123456789";
    public static String getVerifyCode(int strNumber){
        StringBuffer verifyCode = new StringBuffer();
        for (int i = 0; i < strNumber ; i++){
            verifyCode.append(VERIFY_STRING.charAt((int)Math.random()*9));
        }

        return verifyCode.toString();
    }
}
