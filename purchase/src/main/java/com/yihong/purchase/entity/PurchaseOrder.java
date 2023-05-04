package com.yihong.purchase.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * purchase_order
 * @author 
 */
@Data
public class PurchaseOrder implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 采购ID
     */
    private String purchaseId;

    /**
     * 供应商ID
     */
    private String supplierId;

    /**
     * 创建人ID
     */
    private String creatorId;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 总金额
     */
    private BigDecimal totalAmount;

    /**
     * 采购时间
     */
    private Date purchaseTime;

    /**
     * 到货时间
     */
    private Date arrivalTime;

    /**
     * 备注
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