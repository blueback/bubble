package com.antsoft.springboot.action;

import com.antsoft.springboot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by justin on 16/8/23.
 */
@RestController
@RequestMapping("/springboot")
public class HelloWorldController {

    @Autowired
    User user;

    @RequestMapping(value = "/{name}",method = RequestMethod.GET)
    public String sayHelloWorld(@PathVariable("name")String name){
        System.out.println(user.getAddress());
        return "Hello "+name;
    }

}
