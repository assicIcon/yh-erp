package com.yihong.financial.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * payment_apply_item
 * @author 
 */
@Data
public class PaymentApplyItem implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 付款单ID
     */
    private String paymentOrderId;

    /**
     * 发票ID
     */
    private String invoiceId;

    /**
     * 付款项目摘要
     */
    private String paymentItemName;

    /**
     * 应付金额
     */
    private BigDecimal amount;

    /**
     * 币种
     */
    private String currency;

    /**
     * 兑人民币汇率
     */
    private BigDecimal exchangeRate;

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