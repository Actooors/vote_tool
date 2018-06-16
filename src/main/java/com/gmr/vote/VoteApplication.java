package com.gmr.vote;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gmr.vote.dao")
public class VoteApplication {

    public static void main(String[] args) {
        SpringApplication.run(VoteApplication.class, args);
    }
}
