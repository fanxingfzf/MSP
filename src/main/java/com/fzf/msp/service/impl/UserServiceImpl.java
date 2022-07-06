package com.fzf.msp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fzf.msp.entity.User;
import com.fzf.msp.mapper.UserMapper;
import com.fzf.msp.service.UserService;
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

}
