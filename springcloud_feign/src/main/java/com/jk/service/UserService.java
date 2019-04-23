package com.jk.service;

import com.jk.model.*;
import com.jk.util.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <pre>项目名称：dm_springcloud
 * 类名称：UserService
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/15 19:12
 * 修改人：张利瑶
 * 修改时间：2019/4/15 19:12
 * 修改备注：
 * @version </pre>
 */
@FeignClient(value = "SERVICE-PROVIDER",fallback = SchedualServiceHiHystric.class)
public interface UserService extends UserServiceApi{

    //查询天津旅游信息
    @PostMapping("/user/queryTuPian")
    List<JingBean> queryTuPian();
    //查询旅游主题
    @PostMapping("/user/queryZhuTi")
    List<ZhuTiBean> queryZhuTi();
    //查询旅游出行时间
    @PostMapping("/user/queryShiJian")
    List<ShiJianBean> queryShiJian();
    //查询旅游目的地
    @PostMapping("/user/queryMuDi")
    List<MuDiBean> queryMuDi();
    //查询景点详情信息
    @PostMapping("/user/queryJing")
    List<XiangBean> queryJing(@RequestParam("pid") Integer jingId);
    //查询北京游玩信息
    @PostMapping("/user/queryBeiJing")
    List<BeiBean> queryBeiJing();
}
