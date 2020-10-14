package com.app.manager.controller.user;

import com.app.manager.api.user.UserInfoControllerApi;
import com.app.manager.dao.entity.UserInfo;
import com.app.manager.service.UserInfoService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController implements UserInfoControllerApi {

    @Autowired
    private UserInfoService userInfoService;

    @Override
    @GetMapping("/userList")
    @RequiresPermissions("userInfo:view") // 权限管理.
    public UserInfo findUserInfoByUsername(String username) {
        return userInfoService.findByUsername(username);
    }

    @Override
    @PostMapping("/userAdd")
    @RequiresPermissions("userInfo:add")
    public String addUserInfo() {
        return "addUserInfo success!";
    }

    @Override
    @DeleteMapping("/userDelete")
    @RequiresPermissions("userInfo:delete")
    public String deleteUserInfo() {
        return "deleteUserInfo success!";
    }
}
