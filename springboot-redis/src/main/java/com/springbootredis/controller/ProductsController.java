package com.springbootredis.controller;

import com.springbootredis.entyti.Products;
import com.springbootredis.service.ProductsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class ProductsController {
    @Resource
    ProductsService productsService;
    @RequestMapping("productsList")
    public Object productsList(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("Products",productsService.queryProducts());
        mav.setViewName("index");
        return mav;
    }
}
