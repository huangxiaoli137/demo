package com.hxl.mapper;

import com.hxl.entity.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * ProductDao继承基类
 */
@Repository
public interface ProductMapper extends Mapper<Product> {

       List<Product> findAllById(@Param("level") Integer level,@Param("id") Integer id);

       List<Product> findByName(@Param("name") String name);
}