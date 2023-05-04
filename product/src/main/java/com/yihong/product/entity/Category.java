package com.yihong.product.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * category
 * @author 
 */
@Data
public class Category implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 分类ID
     */
    private String categoryId;

    /**
     * 父分类ID
     */
    private String parentCategoryId;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 图标
     */
    private String icon;

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