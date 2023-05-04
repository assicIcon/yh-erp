package com.yihong.product.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * product_sku
 * @author 
 */
@Data
public class ProductSku implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 产品SKU_ID
     */
    private String skuId;

    /**
     * 产品SPU_ID
     */
    private String spuId;

    /**
     * 产品SKU名称
     */
    private String skuName;

    /**
     * 默认图片
     */
    private String defaultImage;

    /**
     * 生效状态: 0-无效; 1-有效;
     */
    private Byte validStatus;

    /**
     * 描述
     */
    private String description;

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