package com.yihong.warehouse.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * warehouse_inventory_detail
 * @author 
 */
@Data
public class WarehouseInventoryDetail implements Serializable {
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
     * 批次ID
     */
    private String batchId;

    /**
     * 关联ID
     */
    private String relationId;

    /**
     * 操作人ID
     */
    private String operatorId;

    /**
     * 出入库类型
     */
    private Byte type;

    /**
     * 出入库数量
     */
    private Integer count;

    /**
     * 备注
     */
    private String remark;

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