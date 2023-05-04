package com.yihong.warehouse.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * warehouse
 * @author 
 */
@Data
public class Warehouse implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 仓库ID
     */
    private String warehouseId;

    /**
     * 仓库名称
     */
    private String warehouseName;

    /**
     * 仓库类型
     */
    private String type;

    /**
     * 生效状态:0-无效; 1-有效;
     */
    private Byte validStatus;

    /**
     * 库容量
     */
    private BigDecimal storageCapacity;

    /**
     * 国家
     */
    private String country;

    /**
     * 省
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 地区
     */
    private String region;

    /**
     * 街道
     */
    private String street;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 描述
     */
    private String description;

    /**
     * 可用库容量
     */
    private BigDecimal availableCapacity;

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