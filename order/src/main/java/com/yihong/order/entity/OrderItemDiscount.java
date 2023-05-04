package com.yihong.order.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * order_item_discount
 * @author 
 */
@Data
public class OrderItemDiscount implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 产品SKU_ID
     */
    private String skuId;

    /**
     * 优惠关联ID
     */
    private String relationId;

    /**
     * 优惠类型
     */
    private String discountType;

    /**
     * 优惠金额
     */
    private BigDecimal discountAmount;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}