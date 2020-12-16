package com.horardrim.cm.spring.demo.k8s.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ThymeleafDemoController {
    @RequestMapping("/thymeleaf")
    public ModelAndView greeting(ModelAndView mv) {
        mv.setViewName("thymeleaf");
        mv.addObject("title","欢迎使用Thymeleaf!");
        return mv;
    }
}
