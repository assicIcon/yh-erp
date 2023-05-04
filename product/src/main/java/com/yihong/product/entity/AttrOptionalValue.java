package com.yihong.product.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * attr_optional_value
 * @author 
 */
@Data
public class AttrOptionalValue implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 属性ID
     */
    private String attrId;

    /**
     * 值
     */
    private String value;

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