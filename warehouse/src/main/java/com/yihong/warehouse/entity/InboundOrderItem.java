package com.yihong.warehouse.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * inbound_order_item
 * @author 
 */
@Data
public class InboundOrderItem implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 入库单ID
     */
    private String inboundOrderId;

    /**
     * 批次ID
     */
    private String batchId;

    /**
     * 产品SKU_ID
     */
    private String skuId;

    /**
     * 数量
     */
    private Integer count;

    /**
     * 包装数量
     */
    private Integer packageQuantity;

    /**
     * 包装长(单位:cm)
     */
    private BigDecimal packageLength;

    /**
     * 包装宽(单位:cm)
     */
    private BigDecimal packageWidth;

    /**
     * 包装高(单位:cm)
     */
    private BigDecimal packageHeight;

    /**
     * 包装重量(单位:kg)
     */
    private BigDecimal packageWeight;

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