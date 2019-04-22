package com.jk.service;

import com.jk.controller.BokeBean;
import com.jk.controller.ChBean;
import com.jk.controller.JinBean;
import com.jk.controller.JiuBean;
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
}
