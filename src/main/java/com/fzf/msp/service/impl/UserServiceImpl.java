package com.fzf.msp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fzf.msp.entity.User;
import com.fzf.msp.mapper.UserMapper;
import com.fzf.msp.service.UserService;
import com.fzf.msp.system.code.SystemCode;
import com.fzf.msp.utils.MD5Util;
import com.fzf.msp.utils.R;
import com.fzf.msp.utils.SystemUtils;
import com.fzf.msp.utils.phone.ValidatorUtil;
import com.fzf.msp.vo.rpg.LoginPageRpg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fzf
 * @since 2022-07-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    public static final String SALT="1a2b3c4d";

    /**
     * 登录
     * @param loginPageRpg
     * @return
     */
    @Override
    public R doLogin(LoginPageRpg loginPageRpg){
        String phone=loginPageRpg.getPhone();
        String password=loginPageRpg.getPassword();
        if (SystemUtils.isEmpty(phone)||SystemUtils.isEmpty(password)){
            return R.fail(SystemCode.MSP_SYSTEM_LOGIN_FAIL_PARAM_NULL,loginPageRpg,"手机号或密码为空");
        }
        if (!ValidatorUtil.isPhone(phone)){
            return R.fail(SystemCode.MSP_SYSTEM_LOGIN_FAIL_INVALID_PHONE,loginPageRpg,"无效手机号");
        }
        User user = baseMapper.selectUser(loginPageRpg);

        //MD5双重加密密码
        String dbPass = MD5Util.inputPassToDBPass(password, SALT);

        return null;
    }
}
