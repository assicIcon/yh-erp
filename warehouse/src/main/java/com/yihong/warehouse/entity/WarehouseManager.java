package com.yihong.warehouse.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * warehouse_manager
 * @author 
 */
@Data
public class WarehouseManager implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 仓库ID
     */
    private String warehouseId;

    /**
     * 联系人名称
     */
    private String contractName;

    /**
     * 联系人手机号码
     */
    private String phoneNumber;

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