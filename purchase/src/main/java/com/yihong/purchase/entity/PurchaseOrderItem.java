package com.yihong.purchase.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * purchase_order_item
 * @author 
 */
@Data
public class PurchaseOrderItem implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 采购批次ID
     */
    private String purchaseBatchId;

    /**
     * 采购单ID
     */
    private String purchaseId;

    /**
     * 产品SKU_ID
     */
    private String skuId;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 数量
     */
    private Integer count;

    /**
     * 到货数量
     */
    private Integer arrivalCount;

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