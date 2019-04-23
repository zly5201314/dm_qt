/**
 * Copyright (C), 2019, 1809B
 * FileName: HotelController
 * Author:   要艳娜
 * Date:     2019/04/18 23:36
 * History:
 * <author>          <time>          <version>          <desc>
 * 要艳娜           修改时间           版本号              描述
 */
package com.jk.controller;

import com.jk.service.UserService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author yao
 * @create 2019/04/18
 * @since 1.0.0
 */
@RestController
public class HotelController {

    @Autowired
    private UserService userservice;


    //查询酒店首页
    @RequestMapping(value = "/queryHotelList")
    public List<HotelBean> queryHotelList(){
        List<HotelBean> list = userservice.queryHotelList();
        return list;

    }

    //查询北京城市
    @RequestMapping(value = "/querybeijing")
    public List<HotelBean> querybeijing(){
        List<HotelBean> list = userservice.querybeijing();
        System.out.println(list);
        return list;

    }

    //查询天津城市
    @RequestMapping(value = "/queryTianJin")
    public List<HotelBean> queryTianJin(){
        List<HotelBean> list = userservice.queryTianJin();
        System.out.println(list);
        return list;

    }

    //查询上海城市
    @RequestMapping( value = "/queryshanghai")
    public List<HotelBean> queryshanghai(){
        List<HotelBean> list = userservice.queryshanghai();
        System.out.println(list);
        return list;

    }

    //查询重庆城市
    @RequestMapping( value = "/querychongqing")
    public List<HotelBean> querychongqing(){
        List<HotelBean> list = userservice.querychongqing();
        System.out.println(list);
        return list;

    }

    //查询杭州城市
    @RequestMapping( value = "/queryhangzhou")
    public List<HotelBean> queryhangzhou(){
        List<HotelBean> list = userservice.queryhangzhou();
        System.out.println(list);
        return list;

    }


    //查询房间
   @GetMapping(value = "/chuan/findCh")
    public HashMap<String,Object> findCh(Integer page,Integer rows,ChBean chBean){
        HashMap<String, Object> hashMap =userservice.findCh(page,rows,chBean);
        System.out.println(hashMap);
       return hashMap;
    }

  /*  //预订房间
    @RequestMapping(value = "/findJiuById")
    public ChBean findJiuById(Integer shopId){
        ChBean chBean=userservice.findJiuById(shopId);
        System.out.println(chBean);
        return chBean;
    }*/

    //立即预订
    @RequestMapping(value = "/saveYu")
    public void saveYu(ChBean chBean){
        userservice.saveYu(chBean);
    }




}

