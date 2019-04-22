package com.jk.service;

import com.jk.controller.BokeBean;
import com.jk.controller.ChBean;
import com.jk.controller.JinBean;
import com.jk.controller.JiuBean;
import com.jk.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
public class UserserviceImpl{

    @Autowired
    private UserMapper userMapper;

    @GetMapping(value = "/hi")
    @ResponseBody
    public String hiService(String name)     {
        return "hi,"+name+",sorry,error!";
    }


    //查询博客
    @GetMapping(value = "/boke/BokeList")
    @ResponseBody
    public List<BokeBean> BokeList(){
        List<BokeBean> list=userMapper.BokeList();
        System.out.println(list);
        return list;
    }

    //查询首页
    @GetMapping(value = "/Jin/JinList")
    @ResponseBody
    public List<JinBean> JinList(){
        List<JinBean> list=userMapper.JinList();
        System.out.println(list);
        return list;
    }


    //查询首页酒店
    @GetMapping("/jiu/JiuList")
    @ResponseBody
    public  List<JiuBean> JiuList(){
        List<JiuBean> list=userMapper.JiuList();
        System.out.println(list);
        return list;
    }

    //查询酒店房间
    @PostMapping("/chuan/findCh")
    @ResponseBody
    public HashMap<String,Object> findCh(@RequestParam(value = "page") Integer page,@RequestParam(value = "rows") Integer rows, @RequestBody ChBean chBean){
        HashMap<String, Object> hashMap = new HashMap<>();
        int count=userMapper.queryChCount(chBean);
        int start=(page-1)*rows;
        List<ChBean> list=userMapper.queryChList(start,rows,chBean);
        hashMap.put("total",count);
        hashMap.put("rows",list);
        return hashMap;
    }


    //预订房间
    @GetMapping("/jiu/findJiuById")
    @ResponseBody
    public  ChBean findJiuById(@RequestParam("shopId") Integer shopId){
        ChBean chBean=userMapper.findJiuById(shopId);
        return chBean;
    };

    //立即预订
    @PutMapping("/yu/saveYu")
    @ResponseBody
    public void saveYu(@RequestBody ChBean chBean){
        userMapper.saveYu(chBean);
    };


    //景点条查
    @GetMapping("/jin/tijiao")
    @ResponseBody
    public List<JinBean> tijiao(@RequestParam("jinName")String jinName){
        List<JinBean> list=userMapper.tijiao(jinName);
        return list;
    };


}
