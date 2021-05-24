package com.hxl.controller;


import com.hxl.entity.Product;
import com.hxl.service.ProductService;
import com.hxl.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "productId")
public class ProductController {


    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public RespBean findAllById(@RequestParam(name = "level") Integer level,
                                @RequestParam(name = "id") Integer id){

        List<Product> products= productService.findAllById(level, id);
        return RespBean.success("查询成功!",products);
    }

    @GetMapping("/{name}")
    public RespBean findByName(@PathVariable String name){
        List<Product> name1 = productService.findByName(name);
        return RespBean.success("查询成功!",name1);
    }

    @GetMapping("/id")
    public RespBean findById(@RequestParam(name ="id")Integer id){
        Product byId = productService.findById(id);
        return  RespBean.success("查询成功!",byId);
    }

}
