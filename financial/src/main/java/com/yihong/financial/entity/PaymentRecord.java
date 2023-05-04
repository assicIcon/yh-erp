package com.yihong.financial.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * payment_record
 * @author 
 */
@Data
public class PaymentRecord implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 付款单ID
     */
    private String paymentOrderId;

    /**
     * 操作人ID
     */
    private String operatorId;

    /**
     * 付款金额
     */
    private BigDecimal paymentAmount;

    /**
     * 币种
     */
    private String currency;

    /**
     * 兑人民币汇率
     */
    private BigDecimal exchangeRate;

    /**
     * 付款时间
     */
    private Date paymentTime;

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