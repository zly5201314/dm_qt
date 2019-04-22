package com.jk.service;

import com.jk.controller.BokeBean;
import com.jk.controller.ChBean;
import com.jk.controller.JinBean;
import com.jk.controller.JiuBean;

import com.jk.controller.ChBean;
import com.jk.controller.HotelBean;
import com.jk.controller.Tree;
import com.jk.controller.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * <pre>项目名称：springcloud2
 * 类名称：UserServiceApi
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/15 10:33
 * 修改人：张利瑶
 * 修改时间：2019/4/15 10:33
 * 修改备注：
 * @version </pre>
 */
public interface UserServiceApi {

    @GetMapping(value = "/hi")
    String hiService(@RequestParam(value = "name") String name);


    //查询博客
    @GetMapping("/boke/BokeList")
    List<BokeBean> BokeList();

    //查询景点
    @GetMapping("/Jin/JinList")
    List<JinBean> JinList();

    //查询首页酒店
    @GetMapping("/jiu/JiuList")
    List<JiuBean> JiuList();

    @PostMapping("/chuan/findCh")
    HashMap<String, Object> findCh(@RequestParam(value = "page") Integer page, @RequestParam(value = "rows") Integer rows, @RequestBody ChBean chBean);

    @GetMapping("/jiu/findJiuById")
    ChBean findJiuById(@RequestParam("shopId") Integer shopId);

    @PutMapping("/yu/saveYu")
    void saveYu(@RequestBody ChBean chBean);

    @GetMapping("/jin/tijiao")
    List<JinBean> tijiao(@RequestParam("jinName")String jinName);

    //查询酒店首页
    @GetMapping(value ="/queryHotelList")
    List<HotelBean> queryHotelList();

    //查询北京
    @GetMapping(value = "querybeijing")
    List<HotelBean> querybeijing();

    //查询天津
    @GetMapping(value = "queryTianJin")
    List<HotelBean> queryTianJin();

    //查询上海
    @GetMapping(value = "queryshanghai")
    List<HotelBean> queryshanghai();

    //查询重庆城市
    @GetMapping(value = "querychongqing")
    List<HotelBean> querychongqing();

    //查询杭州城市
    @GetMapping(value = "queryhangzhou")
    List<HotelBean> queryhangzhou();




    /*登录*/
    @GetMapping("/login")
    String login(@RequestParam("userNumber") String userNumber, @RequestParam("userPassword") String userPassword);


    /*一日游页面*/
    @GetMapping("/queryUserList")
    List<User> queryUserList();


    /*注册*/
    @PostMapping("/regStu")
    String regStu(@RequestParam("userNumber") String userNumber, @RequestParam("userPassword") String userPassword);

    /*树页面*/
    @GetMapping("/getTree")
    List<Tree> getTree();
    /*故宫页面*/
    @GetMapping("/queryGuGong")
    List<User> queryGuGong();
    /*长城页面*/
    @GetMapping("/queryChangCheng")
    List<User> queryChangCheng();
    /*欢乐谷页面*/
    @GetMapping("/queryHuanLeGe")
    List<User> queryHuanLeGe();


}
