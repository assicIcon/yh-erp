package com.yihong.financial.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * company
 * @author 
 */
@Data
public class Company implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 公司ID
     */
    private String companyId;

    /**
     * 注册国家
     */
    private String registrationCountry;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 公司类型
     */
    private String companyType;

    /**
     * 统一社会信用代码
     */
    private String socialCreditCode;

    /**
     * 法人
     */
    private String legalPerson;

    /**
     * 地址
     */
    private String address;

    /**
     * 成立日期
     */
    private Date establishmentDate;

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