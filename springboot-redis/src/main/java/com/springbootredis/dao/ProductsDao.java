package com.springbootredis.dao;

import com.springbootredis.entyti.Products;

import java.util.List;

public interface ProductsDao {
    /*@Select("select * from products where pid=#{pid}")*/
    List<Products> queryProducts();


    int iddProducts(Products products);
}
