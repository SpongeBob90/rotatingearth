package com.wyw.rotatingearth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wyw
 * @date 2018\1\31 0031 11:17
 */
@Controller
public class IndexPage {

    @GetMapping(value = "/index")
    public String index(){
        return "html/rotatingEarth.html";
    }

}
