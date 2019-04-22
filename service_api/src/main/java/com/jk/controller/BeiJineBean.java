package com.jk.controller;

import java.io.Serializable;

/**
 * Package: com.jk.controller
 * <p>
 * Description： TODO
 * <p>
 * Author: 闫占海
 * <p>
 * Date: Created in 2019/4/19 16:52
 * <p>
 * Company: 金科教育
 * <p>
 * Copyright: Copyright (c) 2017
 * <p>
 * Version: 0.0.1
 * <p>
 * Modified By:
 */
public class BeiJineBean implements Serializable {
    private static final long serialVersionUID = 5533166604170515185L;

    private Integer id;
    private String projectname;
    private Integer startAreaid;
    private Integer areaid;
    private String areaname;
    private String tuijian;
    private String startAreaname;
    private String daystrname;
    private String themename;
    private Integer price;
    private Integer daystripid;
    private Integer theme;
    private String beijingimg;

    public String getTuijian() {
        return tuijian;
    }

    public void setTuijian(String tuijian) {
        this.tuijian = tuijian;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public Integer getStartAreaid() {
        return startAreaid;
    }

    public void setStartAreaid(Integer startAreaid) {
        this.startAreaid = startAreaid;
    }

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

    public String getStartAreaname() {
        return startAreaname;
    }

    public void setStartAreaname(String startAreaname) {
        this.startAreaname = startAreaname;
    }

    public String getDaystrname() {
        return daystrname;
    }

    public void setDaystrname(String daystrname) {
        this.daystrname = daystrname;
    }

    public String getThemename() {
        return themename;
    }

    public void setThemename(String themename) {
        this.themename = themename;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDaystripid() {
        return daystripid;
    }

    public void setDaystripid(Integer daystripid) {
        this.daystripid = daystripid;
    }

    public Integer getTheme() {
        return theme;
    }

    public void setTheme(Integer theme) {
        this.theme = theme;
    }

    public String getBeijingimg() {
        return beijingimg;
    }

    public void setBeijingimg(String beijingimg) {
        this.beijingimg = beijingimg;
    }

    @Override
    public String toString() {
        return "BeiJineBean{" +
                "id=" + id +
                ", projectname='" + projectname + '\'' +
                ", startAreaid=" + startAreaid +
                ", areaid=" + areaid +
                ", areaname='" + areaname + '\'' +
                ", tuijian='" + tuijian + '\'' +
                ", startAreaname='" + startAreaname + '\'' +
                ", daystrname='" + daystrname + '\'' +
                ", themename='" + themename + '\'' +
                ", price=" + price +
                ", daystripid=" + daystripid +
                ", theme=" + theme +
                ", beijingimg='" + beijingimg + '\'' +
                '}';
    }
}
