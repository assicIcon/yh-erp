package com.yihong.order.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * order_logistics
 * @author 
 */
@Data
public class OrderLogistics implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 物流单ID
     */
    private String logisticsOrderId;

    /**
     * 物流商ID
     */
    private String logisticsProvidersId;

    /**
     * 物流单号
     */
    private String waybillNo;

    /**
     * 物流状态
     */
    private Byte status;

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
     * 揽收时间
     */
    private Date collectTime;

    /**
     * 发货时间
     */
    private Date deliveryTime;

    /**
     * 确认收货时间
     */
    private Date confirmReceiptTime;

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