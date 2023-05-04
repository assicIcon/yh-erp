package com.yihong.approval.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * approval_node_record
 * @author 
 */
@Data
public class ApprovalNodeRecord implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 审批单ID
     */
    private String approvalId;

    /**
     * 审批人ID
     */
    private String approvalUserId;

    /**
     * 节点审批通过类型
     */
    private String passType;

    /**
     * 审批状态: 0-审批中; 1-同意; 2-驳回;
     */
    private Byte status;

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