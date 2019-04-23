/**
 * Copyright (C), 2019, 1809B
 * FileName: ZhuTiBean
 * Author:   zyf
 * Date:     2019/4/19 13:52
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
public class ZhuTiBean implements Serializable {

    private static final long serialVersionUID = -3033256398283072602L;

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ZhuTiBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
