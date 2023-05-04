package com.yihong.approval.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * approval_cc_record
 * @author 
 */
@Data
public class ApprovalCcRecord implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 审批单ID
     */
    private String approvalId;

    /**
     * 抄送人ID
     */
    private String ccUserId;

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