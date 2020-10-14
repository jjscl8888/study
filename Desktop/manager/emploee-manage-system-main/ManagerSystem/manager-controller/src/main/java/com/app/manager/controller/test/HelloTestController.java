package com.app.manager.controller.test;

import com.app.manager.api.TestControllerApi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/test")
@Controller
public class HelloTestController implements TestControllerApi {

    @Override
    @RequestMapping("/hello")
    @ResponseBody
    public String getHello() {
        return "hello world!";
    }
}
