package com.yihong.order.mapper;

import com.common.mapper.Mapper;
import com.yihong.order.entity.OrderItem;
import com.yihong.order.entity.OrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 订单项映射器
 *
 * @author YiHongUser
 * @date 2023/04/14
 */
public interface OrderItemMapper extends Mapper<OrderItem> {
}
