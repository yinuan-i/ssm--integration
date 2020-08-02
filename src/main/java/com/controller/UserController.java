package com.controller;

import com.biz.UserBiz;
import com.biz.impl.UserBizImpl;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserBiz userBiz;


    @RequestMapping("/getAll")
    public String getAll(Model model){
        System.out.println("controller成功;查询所有");
        List<User> list = userBiz.getAll();
        model.addAttribute("userlist",list);
        return "test"; // 这里直接写文件名，因为配置了视图解析
    }


}
