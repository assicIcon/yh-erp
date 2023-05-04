package com.yihong.approval.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * approval_condition_config
 * @author 
 */
@Data
public class ApprovalConditionConfig implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 审批条件配置ID
     */
    private String approvalConditionConfigId;

    /**
     * 审批配置ID
     */
    private String approvalConfigId;

    /**
     * 条件类型
     */
    private String type;

    /**
     * 条件JSON格式
     */
    private String conditionJson;

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