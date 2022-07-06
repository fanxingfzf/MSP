package com.fzf.msp.controller;

import com.fzf.msp.entity.User;
import com.fzf.msp.service.UserService;
import com.fzf.msp.system.code.SystemCode;
import com.fzf.msp.utils.R;
import com.fzf.msp.vo.rpg.LoginPageRpg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanZhiFei
 * @create 2022/7/6
 */
@RestController
@RequestMapping("/login")
@Slf4j
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/toLogin")
    public R toLogin(){
        log.info("LoginController toLogin start");
        log.info("LoginController toLogin end");
        return R.ok(null,null,"登录成功");
    }

    /**
     * 登录
     * @param loginPageRpg
     * @return
     */
    @RequestMapping("doLogin")
    @ResponseBody
    public R doLogin(LoginPageRpg loginPageRpg){
        return userService.doLogin(loginPageRpg);
    }

}
