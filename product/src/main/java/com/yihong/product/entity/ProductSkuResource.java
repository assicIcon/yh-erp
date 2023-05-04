package com.yihong.product.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * product_sku_resource
 * @author 
 */
@Data
public class ProductSkuResource implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 产品SKU_ID
     */
    private String skuId;

    /**
     * 资源URL
     */
    private String resourceUrl;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 资源类型
     */
    private String resourceType;

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