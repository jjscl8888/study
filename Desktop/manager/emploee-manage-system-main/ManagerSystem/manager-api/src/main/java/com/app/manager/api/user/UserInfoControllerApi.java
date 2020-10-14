package com.app.manager.api.user;


import com.app.manager.dao.entity.UserInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestParam;

@Api(value="user相关接口",description = "test")
public interface UserInfoControllerApi {

    @ApiOperation(value = "根据用户名查询用户信息", httpMethod = "GET")
    public UserInfo findUserInfoByUsername(@RequestParam String username);

    @ApiOperation(value = "添加用户", httpMethod = "POST")
    public String addUserInfo();

    @ApiOperation(value = "删除用户", httpMethod = "DELETE")
    public String deleteUserInfo();
}
