package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <pre>项目名称：dm_qt
 * 类名称：PageController
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/17 14:58
 * 修改人：张利瑶
 * 修改时间：2019/4/17 14:58
 * 修改备注：
 * @version </pre>
 */
@Controller
public class PageController {

    @RequestMapping("jiudian")
    public String jiudian(){
         return "hotels-list";
     }

    @RequestMapping("shouye")
    public String shouye(){
        return "index";
    }

    //跳转博客页面
    @RequestMapping("boke")
    public String boke(){
       return "blog";
    }

    //跳转立即预约
    @RequestMapping("page/xuyu")
    public String xuyu(){
        return "xuyu";
    }

    //预订房间
    @RequestMapping("/page/yudingFjian")
    public String yudingFjian(){
        return "yudingFjian";
    }

    //联系客服
    @RequestMapping("/page/Kefu")
    public String kefu(){
        return "kefu";
    }



}
