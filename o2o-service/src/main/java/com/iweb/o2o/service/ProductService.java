package com.iweb.o2o.service;

import com.iweb.o2o.entity.Product;

import java.util.List;

/**
 * @author azzhu
 * @create 2019-07-20 15:37:44
 */
public interface ProductService {

    /**
     * 查询商品
     * @param product
     * @return
     */
    List<Product> getProducts(Product product);
}
