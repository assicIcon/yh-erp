package com.yihong.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * OrderApplication
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("/com.yihong.order.mapper")
public class OrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

}
