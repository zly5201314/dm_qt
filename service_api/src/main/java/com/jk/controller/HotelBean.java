/**
 * Copyright (C), 2019, 1809B
 * FileName: HotelBean
 * Author:   要艳娜
 * Date:     2019/04/18 23:23
 * History:
 * <author>          <time>          <version>          <desc>
 * 要艳娜           修改时间           版本号              描述
 */
package com.jk.controller;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author yao
 * @create 2019/04/18
 * @since 1.0.0
 */
public class HotelBean implements Serializable {

    private static final long serialVersionUID = -8035208920890519115L;


    private Integer id;
    private Double  pingfen;
    private String  img;
    private String  name;
    private Integer price;
    private Integer endPrice;
    private Date    time;
    private String  phone;
    private Integer room;
    private String dizhi;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPingfen() {
        return pingfen;
    }

    public void setPingfen(Double pingfen) {
        this.pingfen = pingfen;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(Integer endPrice) {
        this.endPrice = endPrice;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public String getDizhi() {
        return dizhi;
    }

    public void setDizhi(String dizhi) {
        this.dizhi = dizhi;
    }

    @Override
    public String toString() {
        return "HotelBean{" +
                "id=" + id +
                ", pingfen=" + pingfen +
                ", img='" + img + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", endPrice=" + endPrice +
                ", time=" + time +
                ", phone='" + phone + '\'' +
                ", room=" + room +
                ", dizhi='" + dizhi + '\'' +
                '}';
    }
}

