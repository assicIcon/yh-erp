package com.yihong.product.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * brand
 * @author 
 */
@Data
public class Brand implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 品牌ID
     */
    private String brandId;

    /**
     * 品牌名称
     */
    private String brandName;

    /**
     * 品牌LOGO
     */
    private String logo;

    /**
     * 生效状态: 0-无效; 1-有效;
     */
    private Byte validStatus;

    /**
     * 排序
     */
    private Integer sort;

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