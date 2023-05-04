package com.yihong.product.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * product_spu
 * @author 
 */
@Data
public class ProductSpu implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 产品SPU_ID
     */
    private String spuId;

    /**
     * 分类ID
     */
    private String categoryId;

    /**
     * 品牌ID
     */
    private String brandId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 主图
     */
    private String image;

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