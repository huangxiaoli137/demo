package com.hxl.mapper;

import com.hxl.entity.ProductCategory;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ProductCategoryDao继承基类
 */
@Repository
public interface ProductCategoryMapper{

    List<ProductCategory> findAllByParentId(int parentId);

}