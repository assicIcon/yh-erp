package com.yihong.order.mapper;

import com.common.mapper.Mapper;
import com.yihong.order.entity.OrderPayment;
import com.yihong.order.entity.OrderPaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 订单付款映射器
 *
 * @author YiHongUser
 * @date 2023/04/14
 */
public interface OrderPaymentMapper extends Mapper<OrderPayment> {
}
