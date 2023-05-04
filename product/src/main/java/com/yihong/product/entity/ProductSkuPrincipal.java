package com.yihong.product.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * product_sku_principal
 * @author 
 */
@Data
public class ProductSkuPrincipal implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 产品SKU_ID
     */
    private String skuId;

    /**
     * 负责人ID
     */
    private String principalId;

    /**
     * 负责类型
     */
    private String principalType;

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