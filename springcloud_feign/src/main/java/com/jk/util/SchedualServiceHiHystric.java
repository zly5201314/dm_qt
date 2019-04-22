/**
 * Copyright (C), 2019, 金科教育
 * FileName: SchedualServiceHiHystric
 * Author:   zyl
 * Date:     2019/4/15 9:43
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.util;

import com.jk.controller.*;
import com.jk.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author zyl
 * @create 2019/4/15
 * @since 1.0.0
 */
@Component
public class SchedualServiceHiHystric implements UserService {


    public String hiService(String name) {
        return "报错";
    }

    @Override
    public List<AreaBean> queryAreaList() {
        return null;
    }

    @Override
    public List<NumberDayBean> queryNumberDay() {
        return null;
    }

    @Override
    public List<NameBean> queryNameBean() {
        return null;
    }

    @Override
    public List<ZhuTiBean> queryZhuTi() {
        return null;
    }

    @Override
    public List<BeiJineBean> queryBeiJing() {
        return null;
    }


    @Override
    public BeiJineBean findUserById(Integer id) {
        return null;
    }

    @Override
    public void saveUser(YuFuBean userBean) {

    }

    @Override
    public List<YuFuBean> queryGouWu() {
        return null;
    }

    @Override
    public void delGouWu(Integer id) {

    }


}
