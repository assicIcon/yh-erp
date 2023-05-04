package com.yihong.warehouse.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * outbound_order_item
 * @author 
 */
@Data
public class OutboundOrderItem implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 出库单ID
     */
    private String outboundOrderId;

    /**
     * 产品SKU_ID
     */
    private String skuId;

    /**
     * 批次ID
     */
    private String batchId;

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