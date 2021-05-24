package com.hxl.mapper;

import com.hxl.entity.News;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * NewsDaO继承基类
 */
@Repository
public interface NewsMapper extends Mapper<News> {

}