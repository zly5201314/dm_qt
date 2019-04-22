package com.jk.controller;

import java.io.Serializable;

/**
 * Package: com.jk.controller
 * <p>
 * Description： TODO
 * <p>
 * Author: 闫占海
 * <p>
 * Date: Created in 2019/4/21 19:27
 * <p>
 * Company: 金科教育
 * <p>
 * Copyright: Copyright (c) 2017
 * <p>
 * Version: 0.0.1
 * <p>
 * Modified By:
 */
public class YuFuBean implements Serializable {
    private static final long serialVersionUID = -4534967789943989833L;
    private Integer id;
    private String projectname;
    private String projectnamee;
    private String projectnameee;
    private String yname;
    private Integer yphone;
    private Integer ynumber;
    private Integer price;
    private String birth;
    private String gouwuimg;
    private String themename;

    public String getProjectnameee() {
        return projectnameee;
    }

    public void setProjectnameee(String projectnameee) {
        this.projectnameee = projectnameee;
    }

    public String getProjectnamee() {
        return projectnamee;
    }

    public void setProjectnamee(String projectnamee) {
        this.projectnamee = projectnamee;
    }

    public String getGouwuimg() {
        return gouwuimg;
    }

    public void setGouwuimg(String gouwuimg) {
        this.gouwuimg = gouwuimg;
    }

    @Override
    public String toString() {
        return "YuFuBean{" +
                "id=" + id +
                ", projectnamee='" + projectnamee + '\'' +
                ", projectname='" + projectname + '\'' +
                ", projectname='" + projectnameee + '\'' +
                ", yname='" + yname + '\'' +
                ", yphone=" + yphone +
                ", ynumber=" + ynumber +
                ", price=" + price +
                ", birth='" + birth + '\'' +

                '}';
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

    public String getYname() {
        return yname;
    }

    public void setYname(String yname) {
        this.yname = yname;
    }

    public Integer getYphone() {
        return yphone;
    }

    public void setYphone(Integer yphone) {
        this.yphone = yphone;
    }

    public Integer getYnumber() {
        return ynumber;
    }

    public void setYnumber(Integer ynumber) {
        this.ynumber = ynumber;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getThemename() {
        return themename;
    }

    public void setThemename(String themename) {
        this.themename = themename;
    }
}
