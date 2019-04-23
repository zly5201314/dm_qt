package com.jk.mapper;

import com.jk.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface UserMapper {

    //天津旅游信息查询

    @GetMapping("/user/queryTuPian")
    List<JingBean> queryTuPian();
    //查询旅游主题信息
    @GetMapping("/user/queryZhuTi")
    List<ZhuTiBean> queryZhuTi();
    //查询旅游出行时间
    @GetMapping("/user/queryShiJian")
    List<ShiJianBean> queryShiJian();
    //查询旅游目的地
    @GetMapping("/user/queryMuDi")
    List<MuDiBean> queryMuDi();
    //查询景点详情
    @GetMapping("/user/queryJing")
    List<XiangBean> queryJing(@RequestParam("pid")Integer jingId);
    //北京旅游信息查询
    @GetMapping("/user/queryBeiJing")
    List<BeiBean> queryBeiJing();
}
