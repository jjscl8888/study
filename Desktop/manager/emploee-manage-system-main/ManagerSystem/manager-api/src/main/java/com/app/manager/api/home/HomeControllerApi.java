package com.app.manager.api.home;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Api(value="Home接口")
public interface HomeControllerApi {
    @ApiOperation(value = "test", httpMethod = "GET")
    public String index();

    @ApiOperation(value = "login", httpMethod = "GET")
    public String login(HttpServletRequest request, Map<String, Object> map) throws Exception;

    @ApiOperation(value = "auth failed", httpMethod = "GET")
    public String unauthorizedRole();

    @ApiOperation(value = "logout", httpMethod = "GET")
    public String logout();
}
