package com.fzf.msp.controller;


import com.fzf.msp.entity.User;
import com.fzf.msp.utils.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fzf
 * @since 2022-07-06
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/user")
    public void kk(){
        User user=new User();

    }
}
