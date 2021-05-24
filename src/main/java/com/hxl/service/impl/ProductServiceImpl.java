package com.hxl.service.impl;

import com.hxl.entity.Product;
import com.hxl.entity.ProductCategory;
import com.hxl.mapper.ProductMapper;
import com.hxl.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> findAllById(Integer level, Integer id) {
        return productMapper.findAllById(level, id);
    }

    @Override
    public List<Product> findByName(String name) {
        return productMapper.findByName(name);
    }

    @Override
    public Product findById(Integer id) {
        return productMapper.selectByPrimaryKey(id);
    }

}
