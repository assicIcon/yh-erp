package com.yihong.approval.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * approval_config
 * @author 
 */
@Data
public class ApprovalConfig implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 审批配置ID
     */
    private String approvalConfigId;

    /**
     * 审批配置名称
     */
    private String approvalConfigName;

    /**
     * 是否发送通知: 0-否; 1-是;
     */
    private Byte notice;

    /**
     * 抄送人类型: 0-配置;1-提交时指定;
     */
    private Byte ccType;

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