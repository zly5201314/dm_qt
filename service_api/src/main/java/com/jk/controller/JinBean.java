package com.jk.controller;

import java.io.Serializable;
import java.util.Date;

/**
 * <pre>项目名称：dm_qt
 * 类名称：JinBean
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/18 16:33
 * 修改人：张利瑶
 * 修改时间：2019/4/18 16:33
 * 修改备注：
 * @version </pre>
 */
public class JinBean implements Serializable {
    private static final long serialVersionUID = -5956340876843634539L;

    private Integer id;

    private  String jinName;

    private Date jinTime;

    private  String jinImg;

    private  String didian;


    public String getJinName() {
        return jinName;
    }

    public void setJinName(String jinName) {
        this.jinName = jinName;
    }

    public Date getJinTime() {
        return jinTime;
    }

    public void setJinTime(Date jinTime) {
        this.jinTime = jinTime;
    }

    public String getDidian() {
        return didian;
    }

    public void setDidian(String didian) {
        this.didian = didian;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJinImg() {
        return jinImg;
    }

    public void setJinImg(String jinImg) {
        this.jinImg = jinImg;
    }

    @Override
    public String toString() {
        return "JinBean{" +
                "id=" + id +
                ", jinName='" + jinName + '\'' +
                ", jinTime=" + jinTime +
                ", jinImg='" + jinImg + '\'' +
                ", didian='" + didian + '\'' +
                '}';
    }
}
