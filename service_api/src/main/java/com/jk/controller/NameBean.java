package com.jk.controller;

import java.io.Serializable;

/**
 * Package: com.jk.controller
 * <p>
 * Description： TODO
 * <p>
 * Author: 闫占海
 * <p>
 * Date: Created in 2019/4/18 14:24
 * <p>
 * Company: 金科教育
 * <p>
 * Copyright: Copyright (c) 2017
 * <p>
 * Version: 0.0.1
 * <p>
 * Modified By:
 */
public class NameBean implements Serializable {
    private static final long serialVersionUID = -4855644154229518801L;
    private Integer nameid;
    private String name;

    public Integer getNameid() {
        return nameid;
    }

    public void setNameid(Integer nameid) {
        this.nameid = nameid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NameBean{" +
                "nameid=" + nameid +
                ", name='" + name + '\'' +
                '}';
    }
}
