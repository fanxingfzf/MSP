package com.fzf.msp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fzf.msp.entity.User;
import com.fzf.msp.utils.R;
import com.fzf.msp.vo.rpg.LoginPageRpg;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fzf
 * @since 2022-07-06
 */
public interface UserService extends IService<User> {

    /**
     * 登录
     * @param loginPageRpg
     * @return
     */
    R doLogin(LoginPageRpg loginPageRpg);
}
