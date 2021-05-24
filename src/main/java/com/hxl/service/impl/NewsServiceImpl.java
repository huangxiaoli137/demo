package com.hxl.service.impl;

import com.hxl.entity.News;
import com.hxl.mapper.NewsMapper;
import com.hxl.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    public NewsMapper newsMapper;

    @Override
    public List<News> findAll() {
        return newsMapper.selectAll();
    }

    @Override
    public News findAllById(Integer id) {
        return newsMapper.selectByPrimaryKey(id);
    }
}
