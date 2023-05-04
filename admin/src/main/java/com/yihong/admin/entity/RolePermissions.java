package com.yihong.admin.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * role_permissions
 * @author 
 */
@Data
public class RolePermissions implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 角色ID
     */
    private String roleId;

    /**
     * 菜单功能ID
     */
    private String menuFunctionId;

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