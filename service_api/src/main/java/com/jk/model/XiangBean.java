/**
 * Copyright (C), 2019, 1809B
 * FileName: XiangBean
 * Author:   zyf
 * Date:     2019/4/19 11:30
 * History:
 * zyf          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.model;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author 月下故城
 * @create 2019/4/19
 * @since 1.0.0
 */
public class XiangBean implements Serializable {

    private static final long serialVersionUID = 387446403428088806L;

    private Integer id;

    private String xingImg;

    private Integer pid;

    private String xiangJie;

    private String xiangDiTu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getXingImg() {
        return xingImg;
    }

    public void setXingImg(String xingImg) {
        this.xingImg = xingImg;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getXiangJie() {
        return xiangJie;
    }

    public void setXiangJie(String xiangJie) {
        this.xiangJie = xiangJie;
    }

    public String getXiangDiTu() {
        return xiangDiTu;
    }

    public void setXiangDiTu(String xiangDiTu) {
        this.xiangDiTu = xiangDiTu;
    }

    @Override
    public String toString() {
        return "XiangBean{" +
                "id=" + id +
                ", xingImg='" + xingImg + '\'' +
                ", pid=" + pid +
                ", xiangJie='" + xiangJie + '\'' +
                ", xiangDiTu='" + xiangDiTu + '\'' +
                '}';
    }
}

