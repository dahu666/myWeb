package dahu.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDemoController {

    @RequestMapping("/hello")//请求路径
    @ResponseBody//返回json数据
    public String hello() {
        return "hello world！ 你好世界！";
    }
}
