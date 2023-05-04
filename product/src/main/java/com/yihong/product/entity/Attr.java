package com.yihong.product.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * attr
 * @author 
 */
@Data
public class Attr implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 属性ID
     */
    private String attrId;

    /**
     * 分类ID
     */
    private String categoryId;

    /**
     * 属性名称
     */
    private String attrName;

    /**
     * 图标
     */
    private String icon;

    /**
     * 可选类型: 0-不可选; 1-可选;
     */
    private Byte optionalType;

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