package com.yihong.purchase.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * supplier
 * @author 
 */
@Data
public class Supplier implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 供应商ID
     */
    private String supplierId;

    /**
     * 供应商名称
     */
    private String supplierName;

    /**
     * 简称
     */
    private String supplierShortName;

    /**
     * 等级
     */
    private Byte level;

    /**
     * 状态
     */
    private Byte status;

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