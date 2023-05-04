package com.yihong.order.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * order_item
 * @author 
 */
@Data
public class OrderItem implements Serializable {
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
     * 产品名称
     */
    private String productName;

    /**
     * 数量
     */
    private Integer count;

    /**
     * 单价
     */
    private BigDecimal unitPrice;

    /**
     * 单个优惠价格
     */
    private BigDecimal unitDiscountAmount;

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