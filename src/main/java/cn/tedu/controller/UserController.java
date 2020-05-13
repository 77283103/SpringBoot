package cn.tedu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
//    @ResponseBody 响应正文
    @ResponseBody
    @RequestMapping("hello")
    public String User(){
        return "Hello,SpringBoot";
    }
@GetMapping("json")
    public JsonResult hello(){
        JsonResult jsonResult=new JsonResult();
        jsonResult.setMessage("欢迎使用SpringBoot");
        jsonResult.setState(1);
        return jsonResult;
    }
}
