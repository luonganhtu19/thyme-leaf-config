package com.codegym.demo.controller;

import com.codegym.demo.service.CustomerService;
import com.codegym.demo.service.CustomerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public ModelAndView view(){
        List customerList = customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("customers",customerList);
        return modelAndView;
    }
}
