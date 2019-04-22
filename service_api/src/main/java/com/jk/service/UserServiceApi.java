package com.jk.service;


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

    //查询房间
    @PostMapping(value = "findCh")
    HashMap<String, Object> findCh(@RequestParam(value = "page")Integer page,  @RequestParam(value = "rows") Integer rows,  @RequestBody ChBean chBean);

    //预订房间
    @GetMapping(value="findJiuById")
    ChBean findJiuById(@RequestParam("shopId")Integer shopId);

    //立即预订
    @PutMapping(value = "saveYu")
    void saveYu(ChBean chBean);


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
