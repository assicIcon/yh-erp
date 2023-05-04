package com.yihong.order.mq;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * TestRocketMq
 *
 * @author Runhu-Wu
 * @date 2023/4/15
 */
@Component
public class TestRocketMq {

	@Resource
	private RocketMQTemplate rocketMQTemplate;

	public void sendMessage(String topic, String message) {
		rocketMQTemplate.convertAndSend(topic, message);
	}

}
