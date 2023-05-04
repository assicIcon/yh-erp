package com.yihong.financial.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * payment_order
 * @author 
 */
@Data
public class PaymentOrder implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 付款单ID
     */
    private String paymentOrderId;

    /**
     * 付款申请ID
     */
    private String paymentApplyId;

    /**
     * 付款公司ID
     */
    private String paymentCompanyId;

    /**
     * 付款类型
     */
    private String paymentType;

    /**
     * 付款方式
     */
    private String paymentMethod;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 收款人
     */
    private String payee;

    /**
     * 收款账号
     */
    private String collectionAccount;

    /**
     * 收款账号开户行
     */
    private String bankName;

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