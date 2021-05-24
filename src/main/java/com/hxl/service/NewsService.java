package com.hxl.service;

import com.hxl.entity.News;

import java.util.List;

public interface NewsService {

    List<News> findAll();

    News findAllById(Integer id);
}
