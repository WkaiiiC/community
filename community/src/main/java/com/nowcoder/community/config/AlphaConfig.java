package com.nowcoder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

//普通的配置类注解
@Configuration

public class AlphaConfig {

    @Bean
    public SimpleDateFormat simpleDateFormat(){
        //获取当前 年月日-时分秒
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
