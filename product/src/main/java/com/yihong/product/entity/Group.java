package com.yihong.product.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * group
 * @author 
 */
@Data
public class Group implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 分组ID
     */
    private String groupId;

    /**
     * 分类ID
     */
    private String categoryId;

    /**
     * 分组名称
     */
    private String groupName;

    /**
     * 图标
     */
    private String icon;

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