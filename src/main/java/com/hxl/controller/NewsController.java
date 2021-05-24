package com.hxl.controller;

import com.hxl.entity.News;
import com.hxl.service.NewsService;
import com.hxl.util.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "news")
public class NewsController {

    @Autowired
    public NewsService newsService;

    @GetMapping(value = "/")
    public RespBean findAll(){
        List<News> list = newsService.findAll();
        return RespBean.success("查询成功!",list);
    }

    @GetMapping(value="/{newsId}")
    public RespBean findAllById(@PathVariable Integer newsId){
        News lis= newsService.findAllById(newsId);
        return RespBean.success("查询成功!",lis);
    }

}
