
package com.jk.controller;

import java.io.Serializable;


public class ChBean implements Serializable {

    private static final long serialVersionUID = -2417629677497780734L;

    private  Integer id;

    private  String fName;

    private  String cName;

    private  String zao;

    private String fuWu;

    private String renShu;

    private String zhengCe;

    private Integer fPrice;

    private Integer fJshui;

    private String fImg;

    private Integer yu;



    public Integer getYu() {
        return yu;
    }

    public void setYu(Integer yu) {
        this.yu = yu;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getZao() {
        return zao;
    }

    public void setZao(String zao) {
        this.zao = zao;
    }

    public String getFuWu() {
        return fuWu;
    }

    public void setFuWu(String fuWu) {
        this.fuWu = fuWu;
    }

    public String getRenShu() {
        return renShu;
    }

    public void setRenShu(String renShu) {
        this.renShu = renShu;
    }

    public String getZhengCe() {
        return zhengCe;
    }

    public void setZhengCe(String zhengCe) {
        this.zhengCe = zhengCe;
    }

    public Integer getfPrice() {
        return fPrice;
    }

    public void setfPrice(Integer fPrice) {
        this.fPrice = fPrice;
    }

    public Integer getfJshui() {
        return fJshui;
    }

    public void setfJshui(Integer fJshui) {
        this.fJshui = fJshui;
    }

    public String getfImg() {
        return fImg;
    }

    public void setfImg(String fImg) {
        this.fImg = fImg;
    }

    @Override
    public String toString() {
        return "ChBean{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", cName='" + cName + '\'' +
                ", zao='" + zao + '\'' +
                ", fuWu='" + fuWu + '\'' +
                ", renShu='" + renShu + '\'' +
                ", zhengCe='" + zhengCe + '\'' +
                ", fPrice=" + fPrice +
                ", fJshui=" + fJshui +
                ", fImg='" + fImg + '\'' +
                ", yu=" + yu +
                '}';
    }
}

