package com.springbootredis.service.impl;

import com.springbootredis.dao.ProductsDao;
import com.springbootredis.entyti.Products;
import com.springbootredis.service.ProductsService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@CacheConfig(cacheNames = {"ProductsServiceImplCache"})
public class ProductsServiceImpl implements ProductsService {
    @Resource
    ProductsDao productsDao;

     @Cacheable(key = "'queryProducts'")
    @Override
    public List<Products> queryProducts() {
        return productsDao.queryProducts();
    }

}
