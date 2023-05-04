package com.yihong.approval.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * approval
 * @author 
 */
@Data
public class Approval implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 审批单ID
     */
    private String approvalId;

    /**
     * 审批配置ID
     */
    private String approvalConfigId;

    /**
     * 业务ID
     */
    private String businessId;

    /**
     * 申请人
     */
    private String applicantId;

    /**
     * 审批状态: 0-审批中; 1-同意; 2-驳回;
     */
    private Byte status;

    /**
     * 审批备注
     */
    private String remark;

    /**
     * 审批完成时间
     */
    private Date approvalFinishTime;

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