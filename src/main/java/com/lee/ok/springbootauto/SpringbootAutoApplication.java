package com.lee.ok.springbootauto;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.lee.**.dao")
//组件扫描
//@ComponentScan(basePackages = {"com.lee.ok.springbootauto"})
@SpringBootApplication
public class SpringbootAutoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAutoApplication.class, args);
    }

}
