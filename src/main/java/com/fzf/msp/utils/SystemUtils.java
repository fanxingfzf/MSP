package com.fzf.msp.utils;

import com.fzf.msp.entity.User;

/**
 * @author fanZhiFei
 * @create 2022/7/7
 */
public class SystemUtils {
    /**
     * 对象是否为空
     * @param obj
     * @return
     */
    public static boolean isEmpty(Object obj){
        return null==obj;
    }

    public static void main(String[] args) {
        User user=new User();
        System.out.println(isEmpty(user.getId()));
    }
}
