package com.hxl.service.impl;

import com.hxl.entity.Product;
import com.hxl.entity.ProductCategory;
import com.hxl.mapper.ProductCategoryMapper;
import com.hxl.mapper.ProductMapper;
import com.hxl.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Override
    public List<ProductCategory> findAllByParentId() {
        List<ProductCategory> list=new ArrayList<>();
        List<ProductCategory> yiji = productCategoryMapper.findAllByParentId(0);
        for (ProductCategory pro:yiji){
            List<ProductCategory> erji=productCategoryMapper.findAllByParentId(pro.getId());
            pro.setChildren(erji);
            List<Product> products = productMapper.findAllById(1,pro.getId());
            pro.setProducts(products);
            for (int i=0;i<pro.getChildren().size();i++){
                List<ProductCategory> sanji=productCategoryMapper.findAllByParentId(pro.getChildren().get(i).getId());
                pro.getChildren().get(i).setChildren(sanji);
            }
            list.add(pro);
        }
        return list;
    }

}
