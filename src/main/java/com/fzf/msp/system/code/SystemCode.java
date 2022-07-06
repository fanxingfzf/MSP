package com.fzf.msp.system.code;

public interface SystemCode {
    /**
     * 通用失败码
     */
    String MSP_SYSTEM_FAIL="0000";
    /**
     * 通用成功码
     */
    String MSP_SYSTEM_SUCCESS="0001";

    //登录  0002-0100
    //登录成功 0002-0050

    //登录失败 0051-0100
    /**
     * 手机号或账号参数为空
     */
    String MSP_SYSTEM_LOGIN_FAIL_PARAM_NULL="0051";
    /**
     * 无效手机号
     */
    String MSP_SYSTEM_LOGIN_FAIL_INVALID_PHONE="0051";
}
