package com.fzf.msp.utils.phone;

import com.fzf.msp.utils.SystemUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author fanZhiFei
 * @create 2022/7/7
 */
public class ValidatorUtil {
    private static final Pattern PHONE_PATTERN=Pattern.compile("[1]([3-9])[0-9]{9}$");

    public static boolean isPhone(String phone){
        if (SystemUtils.isEmpty(phone)){
            return false;
        }
        Matcher matcher=PHONE_PATTERN.matcher(phone);
        return matcher.matches();
    }
}
