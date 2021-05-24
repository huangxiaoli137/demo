package com.hxl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.hxl.mapper")
@SpringBootApplication
public class SpringbootJpaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootJpaApplication.class, args);
    }

}
