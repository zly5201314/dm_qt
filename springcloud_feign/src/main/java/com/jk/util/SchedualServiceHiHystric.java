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

import com.jk.controller.ChBean;
import com.jk.controller.HotelBean;
import com.jk.controller.Tree;
import com.jk.controller.User;
import com.jk.controller.BokeBean;
import com.jk.controller.ChBean;
import com.jk.controller.JinBean;
import com.jk.controller.JiuBean;
import com.jk.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
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
    public List<BokeBean> BokeList() {
        return null;
    }

    @Override
    public List<JinBean> JinList() {
        return null;
    }

    @Override
    public List<JiuBean> JiuList() {
        return null;
    }





    @Override
    public List<JinBean> tijiao(String jinName) {
        return null;
    }


    @Override
    public List<HotelBean> queryHotelList() {
        return null;
    }

    @Override
    public List<HotelBean> querybeijing() {
        return null;
    }

    @Override
    public List<HotelBean> queryTianJin() {
        return null;
    }

    @Override
    public List<HotelBean> queryshanghai() {
        return null;
    }

    @Override
    public List<HotelBean> querychongqing() {
        return null;
    }

    @Override
    public List<HotelBean> queryhangzhou() {
        return null;
    }

    @Override
    public HashMap<String, Object> findCh(Integer page, Integer rows, ChBean chBean) {
        return null;
    }

    @Override
    public ChBean findJiuById(Integer shopId) {
        return null;
    }

    @Override
    public void saveYu(ChBean chBean) {

    }

    @Override
    public String login(String userNumber, String userPassword) {
        return null;
    }

    @Override
    public List<User> queryUserList() {
        return null;
    }

    @Override
    public String regStu(String userNumber, String userPassword) {
        return null;
    }

    @Override
    public List<Tree> getTree() {
        return null;
    }

    @Override
    public List<User> queryGuGong() {
        return null;
    }

    @Override
    public List<User> queryChangCheng() {
        return null;
    }

    @Override
    public List<User> queryHuanLeGe() {
        return null;
    }
}
