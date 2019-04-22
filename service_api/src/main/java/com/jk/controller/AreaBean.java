package com.jk.controller;

import java.io.Serializable;

/**
 * Package: com.jk.controller
 * <p>
 * Description： TODO
 * <p>
 * Author: 闫占海
 * <p>
 * Date: Created in 2019/4/18 14:35
 * <p>
 * Company: 金科教育
 * <p>
 * Copyright: Copyright (c) 2017
 * <p>
 * Version: 0.0.1
 * <p>
 * Modified By:
 */

public class AreaBean implements Serializable {
    private static final long serialVersionUID = -3039007817850921010L;
    private Integer areaid;
    private String areaname;

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    @Override
    public String toString() {
        return "AreaBean{" +
                "areaid=" + areaid +
                ", areaname='" + areaname + '\'' +
                '}';
    }
}
