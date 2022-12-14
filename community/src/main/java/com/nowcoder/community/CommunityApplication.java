package com.nowcoder.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CommunityApplication {

	@PostConstruct
	public void init() {
		// 解决netty启动冲突问题
		// Netty4Utils  setAvailableProcessors()
		System.setProperty("es.set.netty.runtime.available.processors","false");
	}

	public static void main(String[] args) {
		//自动创建了Spring容器，自动扫描包
		SpringApplication.run(CommunityApplication.class, args);
	}

}
