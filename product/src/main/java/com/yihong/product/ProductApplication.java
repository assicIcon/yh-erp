package com.yihong.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * com.yihong.product.ProductApplication
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.yihong.product.mapper")
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

}
