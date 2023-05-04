package com.yihong.financial.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * invoice
 * @author 
 */
@Data
public class Invoice implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 发票ID
     */
    private String invoiceId;

    /**
     * 发票金额
     */
    private BigDecimal amount;

    /**
     * 可用金额
     */
    private BigDecimal availableAmount;

    /**
     * 币种
     */
    private String currency;

    /**
     * 兑人民币汇率
     */
    private BigDecimal exchangeRate;

    /**
     * 发票附件
     */
    private String attachmentUrl;

    /**
     * 开票日期
     */
    private Date issueDate;

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