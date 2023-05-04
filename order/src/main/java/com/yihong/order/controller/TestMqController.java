package com.yihong.order.controller;

import com.common.core.response.Response;
import com.common.core.response.ResponseBuilder;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * TestMqController
 *
 * @author Runhu-Wu
 * @date 2023/4/15
 */
@RestController
@RequestMapping("/mq")
public class TestMqController {

	@Resource
	private RocketMQTemplate rocketMQTemplate;
	@Resource
	private RedisTemplate<String, String> redisTemplate;

	@PostMapping("/send-message")
	public Response<Void> sendMessage(@RequestBody Map<String, String> map) {
		rocketMQTemplate.convertAndSend(map.get("topic"), map.get("msg"));
		redisTemplate.opsForValue().set(map.get("topic"), map.get("msg"));
		return ResponseBuilder.success();
	}


}
