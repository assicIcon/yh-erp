package com.yihong.warehouse.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * warehouse_batch_inventory
 * @author 
 */
@Data
public class WarehouseBatchInventory implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 批次ID
     */
    private String batchId;

    /**
     * 仓库ID
     */
    private String warehouseId;

    /**
     * 产品SKU_ID
     */
    private String skuId;

    /**
     * 状态
     */
    private String status;

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