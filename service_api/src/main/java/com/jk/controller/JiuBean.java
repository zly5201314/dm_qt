/**
 * Copyright (C), 2019, 1809B
 * FileName: JiuBean
 * Author:   要艳娜
 * Date:     2019/04/21 22:16
 * History:
 * <author>          <time>          <version>          <desc>
 * 要艳娜           修改时间           版本号              描述
 */
package com.jk.controller;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * @ClassName JiuBean
 * @Description TODO
 * @Author 要艳娜
 * @Date 2019/04/21 22:16
 * @Version 1.0
 */
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

