package com.yihong.order.mapper;

import com.common.mapper.Mapper;
import com.yihong.order.entity.Order;
import com.yihong.order.entity.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 订单映射器
 *
 * @author YiHongUser
 * @date 2023/04/14
 */
public interface OrderMapper extends Mapper<Order> {
}
