package com.jk.controller;

import java.io.Serializable;

/**
 * Package: com.jk.controller
 * <p>
 * Description： TODO
 * <p>
 * Author: 闫占海
 * <p>
 * Date: Created in 2019/4/18 14:28
 * <p>
 * Company: 金科教育
 * <p>
 * Copyright: Copyright (c) 2017
 * <p>
 * Version: 0.0.1
 * <p>
 * Modified By:
 */
public class NumberDayBean implements Serializable {
    private static final long serialVersionUID = -4095557484935083472L;
    private Integer numberdayid;
    private String numberdayname;

    public Integer getNumberdayid() {
        return numberdayid;
    }

    public void setNumberdayid(Integer numberdayid) {
        this.numberdayid = numberdayid;
    }

    public String getNumberdayname() {
        return numberdayname;
    }

    public void setNumberdayname(String numberdayname) {
        this.numberdayname = numberdayname;
    }

    @Override
    public String toString() {
        return "NumberDayBean{" +
                "numberdayid=" + numberdayid +
                ", numberdayname='" + numberdayname + '\'' +
                '}';
    }
}
