package com.yihong.approval;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ApprovalApplication
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.yihong.approval.mapper")
public class ApprovalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApprovalApplication.class, args);
	}

}
