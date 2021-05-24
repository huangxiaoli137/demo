package com.hxl.service;

import com.hxl.entity.Product;

import java.util.List;

public interface ProductService{

    List<Product> findAllById(Integer level,Integer id);

    List<Product> findByName(String name);

    Product findById(Integer id);

}
