package com.yihong.product.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * product_sku_package
 * @author 
 */
@Data
public class ProductSkuPackage implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 产品SKU_ID
     */
    private String skuId;

    /**
     * 长(单位:cm)
     */
    private BigDecimal length;

    /**
     * 宽(单位:cm)
     */
    private BigDecimal width;

    /**
     * 高(单位:cm)
     */
    private BigDecimal height;

    /**
     * 重量(单位:kg)
     */
    private BigDecimal weight;

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