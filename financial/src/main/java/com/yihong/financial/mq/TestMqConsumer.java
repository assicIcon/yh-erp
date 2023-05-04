package com.yihong.financial.mq;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * TestMqConsumer
 *
 * @author Runhu-Wu
 * @date 2023/4/15
 */
@Slf4j
@Component
@RocketMQMessageListener(topic = "TopicTest", consumerGroup = "test_consumer_group")
public class TestMqConsumer implements RocketMQListener<String> {

	@Resource
	private RedisTemplate<String, String> redisTemplate;

	@Override
	public void onMessage(String s) {
		log.info("consume topic:test message, content:{}", s);
		log.info("get from redis: {}", redisTemplate.opsForValue().get("TopicTest"));
	}

}

