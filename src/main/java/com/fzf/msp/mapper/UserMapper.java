package com.fzf.msp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fzf.msp.entity.User;
import com.fzf.msp.vo.rpg.LoginPageRpg;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author fzf
 * @since 2022-07-06
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     * 通过手机号查询用户
     * @param loginPageRpg
     * @return
     */
    User selectUser(LoginPageRpg loginPageRpg);
}
