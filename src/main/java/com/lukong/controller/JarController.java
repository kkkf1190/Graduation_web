package com.lukong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lukong on 16/9/18.
 */
@Controller
public class JarController {

    @RequestMapping(value = "/jar/sb",method = RequestMethod.GET)
    public String getReg(){
        return "/jar/submit";
    }
    @RequestMapping(value = "/jar/add/{sensor}",method = RequestMethod.GET)
    public String getAdd(@PathVariable("sensor") String sensor){
        return "/jar/addJar";
    }
}
