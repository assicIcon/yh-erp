package com.yihong.order.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * order_payment
 * @author 
 */
@Data
public class OrderPayment implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 付款流水ID
     */
    private String paymentId;

    /**
     * 付款金额
     */
    private BigDecimal payAmount;

    /**
     * 付款方式
     */
    private String payMethod;

    /**
     * 付款状态
     */
    private Byte status;

    /**
     * 付款确认时间
     */
    private Date confirmTime;

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