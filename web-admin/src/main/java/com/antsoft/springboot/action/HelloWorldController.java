package com.antsoft.springboot.action;

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

    @RequestMapping(value = "/{name}",method = RequestMethod.GET)
    public String sayHelloWorld(@PathVariable("name")String name){
        return "Hello "+name;
    }

}
