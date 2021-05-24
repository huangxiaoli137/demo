package com.hxl.service;

import com.hxl.entity.ProductCategory;

import java.util.List;

public interface ProductCategoryService  {

    List<ProductCategory> findAllByParentId();
}
