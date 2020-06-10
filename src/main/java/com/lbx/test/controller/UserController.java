package com.lbx.test.controller;

import com.lbx.test.pojo.User;
import com.lbx.test.service.impl.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import java.util.Optional;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/6/7 20:53
 * NOTE:    User控制器
 */
@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /*
     * 添加 */
    @ResponseBody
    @PostMapping("/addOne")
    public void addOne() {
        userService.add();
    }

    /*接受user参数 添加*/
    @ResponseBody
    @PostMapping("/addOneUser")
    public void addOne(User user) {
        userService.addUser(user);
    }

    /*通过ID查询*/
    @GetMapping("/selectOne/{id}")
    public String addOneUser(@PathVariable("id") Integer id, Map map) {
        Optional<User> optionalUser = userService.selectOne(id);
        User user = optionalUser.get();
        map.put("user", user);
        return "hello";
    }

    /*
     * 通过ID删除   ~未完成*/
    @GetMapping("/deleteOne/{id}")
    public void deleteOne(@PathVariable("id") Integer id) {

    }
}
