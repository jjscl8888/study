package com.app.manager.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="Test接口",description = "test")
public interface TestControllerApi {
    @ApiOperation(value = "test", httpMethod = "GET")
    public String getHello();
}
