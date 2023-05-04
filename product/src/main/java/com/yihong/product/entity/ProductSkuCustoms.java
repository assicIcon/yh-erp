package com.yihong.product.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * product_sku_customs
 * @author 
 */
@Data
public class ProductSkuCustoms implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 产品SKU_ID
     */
    private String skuId;

    /**
     * 海关编码
     */
    private String customsId;

    /**
     * 中文报关名称
     */
    private String customsNameCn;

    /**
     * 英文报关名称
     */
    private String customsNameEn;

    /**
     * 中文发票
     */
    private String chineseInvoice;

    /**
     * 海外发票
     */
    private String overseasInvoice;

    /**
     * 申报价
     */
    private BigDecimal declarationPrice;

    /**
     * 清关单价
     */
    private BigDecimal customClearanceUnitPrice;

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