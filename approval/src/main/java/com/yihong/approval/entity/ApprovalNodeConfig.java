package com.yihong.approval.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * approval_node_config
 * @author 
 */
@Data
public class ApprovalNodeConfig implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 审批配置ID
     */
    private String approvalConfigId;

    /**
     * 审批条件配置ID
     */
    private String approvalConditionConfigId;

    /**
     * 审批人ID
     */
    private String approvalUserId;

    /**
     * 节点审批通过类型: ALL-必须所有都通过; ONE-只需一个人通过;
     */
    private String passType;

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