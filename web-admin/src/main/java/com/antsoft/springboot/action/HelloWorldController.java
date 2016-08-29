package com.antsoft.springboot.action;

import com.antsoft.springboot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by justin on 16/8/23.
 */
@RestController
@RequestMapping("/admin")
public class HelloWorldController {

    @Autowired
    User user;

    @RequestMapping(value = "/{name}",method = RequestMethod.GET)
    public String sayHelloWorld(@PathVariable("name")String name){
        System.out.println(user.getAddress());
        return "Hello "+name;
    }

    @RequestMapping(value = "/menu")
    public String menu(){
        System.out.println(user.getAddress());
        return "Hello ";
    }

    @RequestMapping(value = "/login")
    public String login(HttpServletRequest request,HttpServletResponse response){
        System.out.println(user.getAddress());
//        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
//        response.setHeader("Access-Control-Allow-Credentials", "true");
//        response.setHeader("Access-Control-Allow-Headers", "*");
//        response.setHeader("Access-Control-Allow-Methods", "GET, PUT, POST, DELETE, OPTIONS");
        return "{\"user\":\"Hello\", \"role\": \"ADMIN\", \"uid\": 1}";
    }

}
