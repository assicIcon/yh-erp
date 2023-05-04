package com.yihong.order.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * order
 * @author 
 */
@Data
public class Order implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 会员ID
     */
    private String memberId;

    /**
     * 国家
     */
    private String country;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 订单总金额
     */
    private BigDecimal totalAmount;

    /**
     * 优惠金额
     */
    private BigDecimal discountAmount;

    /**
     * 应付总金额
     */
    private BigDecimal payAmount;

    /**
     * 金额币种
     */
    private String currency;

    /**
     * 兑人民币汇率
     */
    private BigDecimal exchangeRage;

    /**
     * 下单时间
     */
    private Date orderTime;

    /**
     * 订单来源
     */
    private String sourceType;

    /**
     * 订单备注
     */
    private String remark;

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