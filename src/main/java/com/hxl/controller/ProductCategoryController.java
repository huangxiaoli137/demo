package com.hxl.controller;


import com.hxl.entity.ProductCategory;
import com.hxl.service.ProductCategoryService;
import com.hxl.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "product")
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping(value = "/")
    public RespBean findAllByParentId(){
        List<ProductCategory> list = productCategoryService.findAllByParentId();
        return RespBean.success("查询成功!",list);
    }

}
