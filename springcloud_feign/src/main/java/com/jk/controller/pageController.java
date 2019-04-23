/**
 * Copyright (C), 2019, 1809B
 * FileName: pageController
 * Author:   zyf
 * Date:     2019/4/17 12:04
 * History:
 * zyf          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author 月下故城
 * @create 2019/4/17
 * @since 1.0.0
 */
@Controller
public class pageController {
  //查询天津
  @RequestMapping("findZiYou")
  public String findZiYou(){
    return "aaa";
  }
  //查询天津景区详情
  @RequestMapping("findJingQu")
  public String findJingQu(){
    return "jiahui";
  }
  //查询北京景区详情
  @RequestMapping("findBeiJingX")
  public String findBeiJingX(){
    return "jing";
  }
  //查询北京
  @RequestMapping("findBeiJing")
  public String findBeiJing(){
    return "beijing";
  }

  /*@RequestMapping("toView")
  public String goToView(String viewName){
    return viewName;
  }*/
  //查询首页信息
  @RequestMapping("findShouYeZ")
  public String findShouYeZ(){
    return "shouyeZ";
  }


}

