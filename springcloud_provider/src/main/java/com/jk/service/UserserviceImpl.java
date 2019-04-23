package com.jk.service;

import com.jk.mapper.UserMapper;
import com.jk.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
public class UserserviceImpl{
    @Autowired
    private UserMapper usermapper;

    @GetMapping(value = "/hi")
    @ResponseBody
    public String hiService(String name) {
        return "hi,"+name+",sorry,error!";
    }

    //天津旅游信息查询
    @PostMapping("/user/queryTuPian")
    @ResponseBody
    public List<JingBean> queryTuPian(){
        return usermapper.queryTuPian();
    }
    //查询旅游主题
    @PostMapping("/user/queryZhuTi")
    @ResponseBody
    public List<ZhuTiBean> queryZhuTi(){
        return usermapper.queryZhuTi();
    }
    //查询旅游出行时间
    @PostMapping("/user/queryShiJian")
    @ResponseBody
    public List<ShiJianBean> queryShiJian(){
        return usermapper.queryShiJian();
    }
    //查询旅游目的地
    @PostMapping("/user/queryMuDi")
    @ResponseBody
    public List<MuDiBean> queryMuDi(){
        return usermapper.queryMuDi();
    }
    //查询景点详情
    @PostMapping("/user/queryJing")
    @ResponseBody
    public List<XiangBean> queryJing(@RequestParam("pid")Integer jingId){
        return usermapper.queryJing(jingId);
    }
    //查询北京旅游信息
    @PostMapping("/user/queryBeiJing")
    @ResponseBody
    public List<BeiBean> queryBeiJing(){
        return usermapper.queryBeiJing();
    }
}
