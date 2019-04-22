package com.jk.service;

import com.jk.controller.*;
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
    @GetMapping(value = "queryAreaList")
    @ResponseBody
    List<AreaBean> queryAreaList();
    @GetMapping(value = "queryNumberDay")
    @ResponseBody
    List<NumberDayBean> queryNumberDay();
    @GetMapping(value = "queryNameBean")
    @ResponseBody
    List<NameBean> queryNameBean();
    @GetMapping(value = "queryZhuTi")
    @ResponseBody
    List<ZhuTiBean> queryZhuTi();
    @GetMapping(value = "queryBeiJing")
    @ResponseBody
    List<BeiJineBean> queryBeiJing();
    @GetMapping(value = "findUserById")
    @ResponseBody
    BeiJineBean findUserById(@RequestParam("id")Integer id);
    @PostMapping(value = "saveUser")
    @ResponseBody
    void saveUser(@RequestBody YuFuBean userBean);
    @GetMapping(value = "queryGouWu")
    @ResponseBody
    List<YuFuBean> queryGouWu();
    @DeleteMapping(value = "delGouWu")
    @ResponseBody
    void delGouWu(@RequestParam("id")Integer id);
}


