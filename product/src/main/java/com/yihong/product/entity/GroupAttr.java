package com.yihong.product.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * group_attr
 * @author 
 */
@Data
public class GroupAttr implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 分组ID
     */
    private String groupId;

    /**
     * 属性ID
     */
    private String attrId;

    /**
     * 排序
     */
    private Integer sort;

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