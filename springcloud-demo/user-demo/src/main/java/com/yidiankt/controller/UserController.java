package com.yidiankt.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;

@RestController
public class UserController {

    @Value("${server.port}")
    int port;

    @RequestMapping("/user/{id}")
    public String getUser(@PathVariable("id") int id){
        if (id==1){
            return "name1"+port;
        }else if (id==2){
            return "name2"+port;
        } else {
            return "name3"+port;
        }
    }

    @RequestMapping(value = "/user2",method = RequestMethod.POST)
    public String getUser2(@RequestBody User user){
        System.out.println(user);
        return "ok"+user;
    }

    @RequestMapping(value = "/user3",method = RequestMethod.POST)
    public String getUser3(@RequestBody String gson){
        System.out.println("gson = " + gson);
        return "ok3"+gson;
    }


//    @RequestMapping(value = "/user4/{route}",method = RequestMethod.POST)
//    public String getUser4(@PathVariable("route") Long route,@RequestBody String gson){
//        System.out.println(route);
//        System.out.println("gson = " + gson);
//        return "ok4 "+route+"  "+gson;
//    }

    @RequestMapping(value = "/user4",method = RequestMethod.POST)
    public String getUser4(@RequestBody String gson,@RequestHeader(value = "route") String route){
        System.out.println("route = " + route);
        System.out.println("gson = " + gson);
        return "ok4 "+"  "+gson;
    }

}
