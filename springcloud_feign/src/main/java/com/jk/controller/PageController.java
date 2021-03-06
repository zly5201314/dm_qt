
package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {


    //跳转到酒店页面
    @RequestMapping("listHotel")
    public String listTicket(){
        return "hotel";
    }


    @RequestMapping("jiudian")
    public String jiudian(){
         return "hotels-list";
     }

    @RequestMapping("shouye")
    public String shouye(){
        return "index";
    }

    //跳转博客页面
    @RequestMapping("boke")
    public String boke(){
       return "blog";
    }

    //跳转立即预约
    @RequestMapping("page/xuyu")
    public String xuyu(){
        return "xuyu";
    }

    //预订房间
    @RequestMapping("/page/yudingFjian")
    public String yudingFjian(){
        return "yudingFjian";
    }

    //联系客服
    @RequestMapping("/page/Kefu")
    public String kefu(){
        return "kefu";
    }

    /*登录*/
    @RequestMapping("getLogin")
    public String getLogin(){
        return "login";
    }
    /*注册*/
    @RequestMapping("getRegister")
    public String getRegister(){

        return "register";
    }
    /*一日游页面*/
    @RequestMapping("get")
    public String get(){

        return "one";
    }
    /*树页面*/
    @RequestMapping("aaa")
    public String aaa(){
        return "oneday";
    }
    /*故宫页面*/
    @RequestMapping("gugong")
    public String gugong(){

        return "GuGong";
    }
    /*长城页面*/
    @RequestMapping("changcheng")
    public String changcheng(){

        return "changcheng";
    }
    /*欢乐谷页面*/
    @RequestMapping("happy")
    public String happy(){

        return "happy";
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

}


