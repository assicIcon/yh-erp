package com.yihong.admin.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * department
 * @author 
 */
@Data
public class Department implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 部门ID
     */
    private String departmentId;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 生效状态: 0-无效; 1-有效;
     */
    private Byte validStatus;

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