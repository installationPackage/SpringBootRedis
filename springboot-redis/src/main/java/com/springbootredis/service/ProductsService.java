package com.springbootredis.service;

import com.springbootredis.entyti.Products;

import java.util.List;

public interface ProductsService {
    List<Products> queryProducts();
}
