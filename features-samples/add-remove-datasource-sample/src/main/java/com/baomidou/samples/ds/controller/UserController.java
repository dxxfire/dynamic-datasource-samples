package com.baomidou.samples.ds.controller;

import com.baomidou.samples.ds.entity.User;
import com.baomidou.samples.ds.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author robin
 */
@RequestMapping("/users")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/session")
    public List<User> session(HttpServletRequest request) {
        request.getSession().setAttribute("tenantName", "tenant1");
        return userService.selectSpelBySession();
    }

    @GetMapping("/header")
    public List<User> header() {
        return userService.selectSpelByHeader();
    }

    @GetMapping("/master")
    public List<User> spel0() {
        return userService.selectSpelByKey("master");
    }

    @GetMapping("/spel1")
    public List<User> spel1() {
        return userService.selectSpelByKey("slave_1");
    }

    @GetMapping("/spel2")
    public List<User> spel2() {
        User user = new User();
        user.setTenantName("slave_2");
        return userService.selecSpelByTenant(user);
    }
}