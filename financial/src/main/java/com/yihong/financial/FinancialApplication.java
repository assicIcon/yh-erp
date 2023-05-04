package com.yihong.financial;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * FinancialApplication
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.yihong.financial.mapper")
public class FinancialApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancialApplication.class, args);
	}

}
