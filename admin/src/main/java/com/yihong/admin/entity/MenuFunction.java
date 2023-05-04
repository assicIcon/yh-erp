package com.yihong.admin.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * menu_function
 * @author 
 */
@Data
public class MenuFunction implements Serializable {
    /**
     * 自增ID
     */
    private Long id;

    /**
     * 菜单功能ID
     */
    private String menuFunctionId;

    /**
     * 菜单ID
     */
    private String menuId;

    /**
     * 菜单功能名称
     */
    private String menuFunctionName;

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