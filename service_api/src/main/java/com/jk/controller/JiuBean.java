
package com.jk.controller;

import java.io.Serializable;


public class JiuBean implements Serializable {

    private static final long serialVersionUID = 5873483778623302059L;

    private  Integer id;

    private  String jiuImg;

    private String chengshi;

    private Integer price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJiuImg() {
        return jiuImg;
    }

    public void setJiuImg(String jiuImg) {
        this.jiuImg = jiuImg;
    }

    public String getChengshi() {
        return chengshi;
    }

    public void setChengshi(String chengshi) {
        this.chengshi = chengshi;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "JiuBean{" +
                "id=" + id +
                ", jiuImg='" + jiuImg + '\'' +
                ", chengshi='" + chengshi + '\'' +
                ", price=" + price +
                '}';
    }
}

