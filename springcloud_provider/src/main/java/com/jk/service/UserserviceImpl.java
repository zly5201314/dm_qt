package com.jk.service;

import com.jk.controller.*;
import com.jk.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * <pre>项目名称：springcloud
 * 类名称：UserserviceImpl
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/12 21:08
 * 修改人：张利瑶
 * 修改时间：2019/4/12 21:08
 * 修改备注：
 * @version </pre>
 */
@Controller
public class UserserviceImpl implements UserServiceApi{

    @Autowired
    private UserMapper userMapper;
    @GetMapping(value = "/hi")
    @ResponseBody
    public String hiService(String name) {
        return "hi,"+name+",sorry,error!";
    }

    @Override
    @ResponseBody
    public List<AreaBean> queryAreaList() {

        return userMapper.queryAreaList();
    }

    @Override
    @ResponseBody
    public List<NumberDayBean> queryNumberDay() {
        return userMapper.queryNumberDay();
    }

    @Override
    @ResponseBody
    public List<NameBean> queryNameBean() {
        return userMapper.queryNameBean();
    }

    @Override
    @ResponseBody
    public List<ZhuTiBean> queryZhuTi() {
        return userMapper.queryZhuTi();
    }

    @Override
    @ResponseBody
    public List<BeiJineBean> queryBeiJing() {

        return userMapper.queryBeiJing();
    }
    @Override
    @ResponseBody
    public List<YuFuBean> queryGouWu() {

        return userMapper.queryGouWu();
    }
    @Override
    @DeleteMapping("delGouWu")
    @ResponseBody
    public void delGouWu(@RequestParam("id") Integer id) {
        userMapper.delGouWu(id);
    }

    @Override
    @ResponseBody
    public BeiJineBean findUserById(@RequestParam("id")Integer id) {

        return userMapper.findUserById(id);
    }

    @Override
    @PostMapping("saveUser")
    @ResponseBody
    public void saveUser(@RequestBody YuFuBean userBean) {
        userMapper.saveUser(userBean);
    }




}
