package com.yihong.purchase.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * supplier_account
 * @author 
 */
@Data
public class SupplierAccount implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 供应商账户ID
     */
    private String supplierAccountId;

    /**
     * 供应商ID
     */
    private String supplierId;

    /**
     * 账户类型
     */
    private Byte accountType;

    /**
     * 收款人
     */
    private String payee;

    /**
     * 收款账号
     */
    private String collectionAccount;

    /**
     * 收款账号开户行
     */
    private String bankName;

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