package com.jk.controller;

import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * <pre>项目名称：dm_springcloud
 * 类名称：UserController
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/15 19:07
 * 修改人：张利瑶
 * 修改时间：2019/4/15 19:07
 * 修改备注：
 * @version </pre>
 */
@Controller
public class UserController {

    @Autowired
    private UserService userservice;


    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return userservice.hiService( name );
    }

    //-------------------------------------------------------------景点跳转
    @GetMapping(value = "/luxian")
    public String jiudian1() {

        return "luxian";
    }
    //-------------------------------------------------------------景点详情跳转
    @GetMapping(value = "/jihua")
    public String jihua() {

        return "jihua";
    }
    //-------------------------------------------------------------景点预订跳转
    @GetMapping(value = "/yuding")
    public String yuding() {

        return "yuding";
    }
    //-------------------------------------------------------------景点加入购物车跳转
    @GetMapping(value = "/yudingg")
    public String yudingg() {

        return "yudingg";
    }
    //-------------------------------------------------------------购物车查询跳转
    @GetMapping(value = "/querygouwuche")
    public String querygouwuche() {

        return "querygouwuche";
    }

    //-------------------------------------------------------------区域查询
    @GetMapping(value = "queryAreaList")
    @ResponseBody
    public List<AreaBean> queryAreaList() {
        List<AreaBean> areaBeans = userservice.queryAreaList();
        return areaBeans;
    }


    //--------------------------------------------------------------天数查询
    @GetMapping(value = "queryNumberDay")
    @ResponseBody
    public List<NumberDayBean> queryNumberDay() {
        List<NumberDayBean> NumberDay = userservice.queryNumberDay();
        return NumberDay;
    }

    //--------------------------------------------------------------景点查询
    @GetMapping(value = "queryNameBean")
    @ResponseBody
    public List<NameBean> queryNameBean() {
        return userservice.queryNameBean();
    }
    //--------------------------------------------------------------主题查询
    @GetMapping(value = "queryZhuTi")
    @ResponseBody
    public List<ZhuTiBean> queryZhuTi() {
        return userservice.queryZhuTi();
    }

    //--------------------------------------------------------------旅行路线查询
    @GetMapping(value = "queryBeiJing")
    @ResponseBody
    public List<BeiJineBean> queryBeiJing() {
        List<BeiJineBean> beiJingTrees = userservice.queryBeiJing();
        return beiJingTrees;
    }
    //--------------------------------------------------------------购物车查询
    @GetMapping(value = "queryGouWu")
    @ResponseBody
    public List<YuFuBean> queryGouWu() {
        List<YuFuBean> gouwu = userservice.queryGouWu();
        return gouwu;
    }
    //--------------------------------------------------------------旅行路线详情查询
    @GetMapping("openUpdate")
    @ResponseBody
    public BeiJineBean findUserBy(@RequestParam("id") Integer id){
        BeiJineBean beiJingTrees = userservice.findUserById(id);

        return beiJingTrees;
    }
    //--------------------------------------------------------------删除购物
    @DeleteMapping("delGouWu")
    @ResponseBody
    public void delGouWu(@RequestParam("id") Integer id){
            userservice.delGouWu(id);
    }
    //-------------------------------------------------------------购物车新增
    @PostMapping("saveUser")
    @ResponseBody
    public Boolean saveUser(@RequestBody YuFuBean userBean){
        try {
            userservice.saveUser(userBean);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }






}
