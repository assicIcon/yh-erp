package com.yihong.warehouse.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * warehouse_inventory
 * @author 
 */
@Data
public class WarehouseInventory implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 仓库ID
     */
    private String warehouseId;

    /**
     * 产品SKU_ID
     */
    private String skuId;

    /**
     * 计划数量
     */
    private Long planQuantity;

    /**
     * 生产中数量
     */
    private Long productQuantity;

    /**
     * 在途数量
     */
    private Long inTransitQuantity;

    /**
     * 入库中数量
     */
    private Long inboundQuantity;

    /**
     * 锁定数量
     */
    private Long lockQuantity;

    /**
     * 可用数量
     */
    private Long availableQuantity;

    /**
     * 不良数量
     */
    private Long badQuantity;

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