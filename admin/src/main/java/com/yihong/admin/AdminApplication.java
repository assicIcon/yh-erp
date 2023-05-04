package com.yihong.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * AdminApplication
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.yihong.admin.mapper")
public class AdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}

}
