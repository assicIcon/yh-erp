package com.yihong.warehouse.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * inbound_order
 * @author 
 */
@Data
public class InboundOrder implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 入库单ID
     */
    private String inboundOrderId;

    /**
     * 仓库ID
     */
    private String warehouseId;

    /**
     * 操作人ID
     */
    private String operatorId;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 入库类型
     */
    private String type;

    /**
     * 总数量
     */
    private Integer totalCount;

    /**
     * 总件数
     */
    private Integer totalQuantity;

    /**
     * 总体积(m³)
     */
    private BigDecimal totalVolume;

    /**
     * 总重量(kg)
     */
    private BigDecimal totalWeight;

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