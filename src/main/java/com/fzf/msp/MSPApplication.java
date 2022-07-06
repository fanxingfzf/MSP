package com.fzf.msp;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fzf.msp.mapper")
@Slf4j
public class MSPApplication {

    public static void main(String[] args) {
        log.info("项目启动中.....");
        SpringApplication.run(MSPApplication.class, args);
        log.info("项目启动成功.....");
    }
}
