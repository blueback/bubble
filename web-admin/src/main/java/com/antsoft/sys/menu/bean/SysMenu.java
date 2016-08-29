package com.antsoft.sys.menu.bean;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by justin on 16/8/27.
 */
@Component
public class SysMenu {

    private Integer id;

    private String key;

    private String name;

    private String icon;

    private Integer level;

    private Integer status;

    private Integer state;

    private List<SysMenu> subSysMenus;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public List<SysMenu> getSubSysMenus() {
        return subSysMenus;
    }

    public void setSubSysMenus(List<SysMenu> subSysMenus) {
        this.subSysMenus = subSysMenus;
    }
}
