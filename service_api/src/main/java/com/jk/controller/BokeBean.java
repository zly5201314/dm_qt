package com.jk.controller;

import java.io.Serializable;
import java.util.Date;

/**
 * <pre>项目名称：dm_qt
 * 类名称：BokeBean
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/18 10:56
 * 修改人：张利瑶
 * 修改时间：2019/4/18 10:56
 * 修改备注：
 * @version </pre>
 */
public class BokeBean implements Serializable {
    private static final long serialVersionUID = -5145232469096448336L;

    private  Integer id;

    private  String bokeImg;

    private String bokeName;

    private Integer bokePrice;

    private String bokeZuoZhe;

    private Date  bokeTime;

    private String bokeXiang;

    public String getBokeZuoZhe() {
        return bokeZuoZhe;
    }

    public void setBokeZuoZhe(String bokeZuoZhe) {
        this.bokeZuoZhe = bokeZuoZhe;
    }

    public Date getBokeTime() {
        return bokeTime;
    }

    public void setBokeTime(Date bokeTime) {
        this.bokeTime = bokeTime;
    }

    public String getBokeXiang() {
        return bokeXiang;
    }

    public void setBokeXiang(String bokeXiang) {
        this.bokeXiang = bokeXiang;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBokeImg() {
        return bokeImg;
    }

    public void setBokeImg(String bokeImg) {
        this.bokeImg = bokeImg;
    }

    public String getBokeName() {
        return bokeName;
    }

    public void setBokeName(String bokeName) {
        this.bokeName = bokeName;
    }

    public Integer getBokePrice() {
        return bokePrice;
    }

    public void setBokePrice(Integer bokePrice) {
        this.bokePrice = bokePrice;
    }


    @Override
    public String toString() {
        return "BokeBean{" +
                "id=" + id +
                ", bokeImg='" + bokeImg + '\'' +
                ", bokeName='" + bokeName + '\'' +
                ", bokePrice=" + bokePrice +
                '}';
    }
}
