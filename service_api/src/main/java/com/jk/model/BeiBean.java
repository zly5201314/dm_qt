/**
 * Copyright (C), 2019, 1809B
 * FileName: BeiBean
 * Author:   zyf
 * Date:     2019/4/21 18:50
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
 * @create 2019/4/21
 * @since 1.0.0
 */
public class BeiBean implements Serializable {

    private static final long serialVersionUID = 3447253375718450255L;

    private Integer jingId;

    private String jingName;

    private String jingTu;

    private Integer jingJia;

    private String jingJie;

    public String getJingJie() {
        return jingJie;
    }

    public void setJingJie(String jingJie) {
        this.jingJie = jingJie;
    }

    public Integer getJingJia() {
        return jingJia;
    }

    public void setJingJia(Integer jingJia) {
        this.jingJia = jingJia;
    }

    public String getJingTu() {
        return jingTu;
    }

    public void setJingTu(String jingTu) {
        this.jingTu = jingTu;
    }

    public Integer getJingId() {
        return jingId;
    }

    public void setJingId(Integer jingId) {
        this.jingId = jingId;
    }

    public String getJingName() {
        return jingName;
    }

    public void setJingName(String jingName) {
        this.jingName = jingName;
    }

    @Override
    public String toString() {
        return "JingBean{" +
                "jingId=" + jingId +
                ", jingName='" + jingName + '\'' +
                ", jingTu='" + jingTu + '\'' +
                ", jingJia=" + jingJia +
                ", jingJie='" + jingJie + '\'' +
                '}';
    }
}

