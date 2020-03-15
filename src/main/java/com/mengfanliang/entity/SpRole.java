package com.mengfanliang.entity;

import java.io.Serializable;

/**
 * sp_role
 * @author 
 */
public class SpRole implements Serializable {
    private Integer roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 权限ids,1,2,5
     */
    private String psIds;

    /**
     * 控制器-操作,控制器-操作,控制器-操作
     */
    private String psCa;

    private String roleDesc;

    private static final long serialVersionUID = 1L;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getPsIds() {
        return psIds;
    }

    public void setPsIds(String psIds) {
        this.psIds = psIds;
    }

    public String getPsCa() {
        return psCa;
    }

    public void setPsCa(String psCa) {
        this.psCa = psCa;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }
}