package com.yihong.approval.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * approval_notice_config
 * @author 
 */
@Data
public class ApprovalNoticeConfig implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 审批配置ID
     */
    private String approvalConfigId;

    /**
     * 类型
     */
    private String type;

    /**
     * 通知模板
     */
    private String noticeTemplate;

    /**
     * 审批通知对象
     */
    private String target;

    /**
     * 生效状态: 0-无效; 1-有效;
     */
    private Byte validStatus;

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