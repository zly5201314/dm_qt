package com.jk.service;

import com.jk.controller.ChBean;
import com.jk.controller.HotelBean;
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
    private UserMapper usermapper;

    @GetMapping(value = "/hi")
    @ResponseBody
    public String hiService(String name) {
        return "hi,"+name+",sorry,error!";
    }

    //查询酒店首页
    @GetMapping(value = "/queryHotelList")
    @ResponseBody
    public List<HotelBean> queryHotelList(){
        List<HotelBean> list = usermapper.queryHotelList();
        System.out.println(list);
        return list;
    }

    //查询北京
    @GetMapping(value = "/querybeijing")
    @ResponseBody
    public List<HotelBean> querybeijing(){
        List<HotelBean> list = usermapper.querybeijing();
        System.out.println(list);
        return list;
    }

    //查询天津
    @GetMapping(value = "/queryTianJin")
    @ResponseBody
    public List<HotelBean> queryTianJin(){
        List<HotelBean> list = usermapper.queryTianJin();
        System.out.println(list);
        return list;
    }

    //查询上海
    @GetMapping(value = "/queryshanghai")
    @ResponseBody
    public List<HotelBean> queryshanghai(){
        List<HotelBean> list = usermapper.queryshanghai();
        System.out.println(list);
        return list;
    }


    //查询重庆
    @GetMapping(value = "/querychongqing")
    @ResponseBody
    public List<HotelBean> querychongqing(){
        List<HotelBean> list = usermapper.querychongqing();
        System.out.println(list);
        return list;
    }

    //查询杭州
    @GetMapping(value = "/queryhangzhou")
    @ResponseBody
    public List<HotelBean> queryhangzhou(){
        List<HotelBean> list = usermapper.queryhangzhou();
        System.out.println(list);
        return list;
    }

    //查询酒店房间
    @PostMapping(value = "/findCh")
    @ResponseBody
    public HashMap<String,Object> findCh(@RequestParam(value = "page") Integer page, @RequestParam(value = "rows") Integer rows, @RequestBody ChBean chBean){
        HashMap<String, Object> hashMap = new HashMap<>();
        int count=usermapper.queryChCount(chBean);
        int start=(page-1)*rows;
        List<ChBean> list=usermapper.queryChList(start,rows,chBean);
        hashMap.put("total",count);
        hashMap.put("rows",list);
        return hashMap;
    }


    //预订房间
    @GetMapping(value = "/findJiuById")
    @ResponseBody
    public  ChBean findJiuById(@RequestParam("shopId") Integer shopId){
        ChBean chBean=usermapper.findJiuById(shopId);
        return chBean;
    };

    //立即预订
    @PutMapping(value = "/saveYu")
    @ResponseBody
    public void saveYu(@RequestBody ChBean chBean){
        usermapper.saveYu(chBean);
    };

}
