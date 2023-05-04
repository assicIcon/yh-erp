package com.yihong.purchase.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * supplier_quotation
 * @author 
 */
@Data
public class SupplierQuotation implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 供应商ID
     */
    private String supplierId;

    /**
     * 产品SKU_ID
     */
    private String skuId;

    /**
     * 操作人
     */
    private String operatorId;

    /**
     * 单价
     */
    private BigDecimal unitPrice;

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