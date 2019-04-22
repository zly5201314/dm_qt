/**
 * Copyright (C), 2019, 1809B
 * FileName: PageController
 * Author:   要艳娜
 * Date:     2019/04/17 17:22
 * History:
 * <author>          <time>          <version>          <desc>
 * 要艳娜           修改时间           版本号              描述
 */
package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author yao
 * @create 2019/04/17
 * @since 1.0.0
 */
@Controller
public class PageController {

    //跳转到酒店页面
    @RequestMapping("listHotel")
    public String listTicket(){

        return "hotel";
    }

    //跳转立即预约
    @RequestMapping("xuyu")
    public String xuyu(){
        return "xuyu";
    }

    //预订房间
    @RequestMapping("/page/yudingFjian")
    public String yudingFjian(){
        return "yudingFjian";
    }

    //联系客服
    @RequestMapping("Kefu")
    public String kefu(){
        return "kefu";
    }
}

