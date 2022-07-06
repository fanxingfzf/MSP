package com.fzf.msp.vo.rpg;

import lombok.Data;

/**
 * 接收网页参数
 * @author fanZhiFei
 * @create 2022/7/6
 */
@Data
public class LoginPageRpg {
    /**
     * 手机号
     */
    private String phone;
    /**
     * 密码
     */
    private String password;
}
