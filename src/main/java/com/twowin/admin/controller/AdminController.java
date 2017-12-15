package com.twowin.admin.controller;

import com.twowin.admin.util.UserLoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台入口
 * Created by ckl on 2017/12/15.
 */
@Controller
@RequestMapping("admin")
public class AdminController {

    /**
     * 登录页面
     * @return
     */
    @GetMapping("login")
    public String login() {
        return "admin/login";
    }

    /**
     * 登录方法
     * @param form
     * @return
     */
    @PostMapping("login")
    public String login(UserLoginForm form) {
        return "redirect:main";
    }

    /**
     * 后台主页
     * @return
     */
    @RequestMapping("main")
    public String main() {
        return "admin/main";
    }

}
