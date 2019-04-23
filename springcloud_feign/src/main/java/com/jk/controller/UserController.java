package com.jk.controller;


import com.jk.model.*;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>项目名称：dm_springcloud
 * 类名称：UserController
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/15 19:07
 * 修改人：张利瑶
 * 修改时间：2019/4/15 19:07
 * 修改备注：
 * @version </pre>
 */
@RestController
public class UserController {

    @Autowired
    private UserService userservice;

/*    @Autowired
    private SolrClient client;*/

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return userservice.hiService( name );
    }

   //查询天津游玩信息
    @GetMapping("/user/queryTuPian")
    public List<JingBean> queryTuPian(){
        List<JingBean> list=new ArrayList<>();
        list = userservice.queryTuPian();
        return list;
    }
  /* //slor
   @GetMapping("/search")
   public List<JingBean> userlist(JingBean jingBean) throws IOException, SolrServerException {
       //因为使用easyui返回数据
       Map<String,Object> mSolr=new HashMap<String,Object>();

       //把所有查询的高亮显示内容发到list中
       List<JingBean> carList=new ArrayList<>();
       //查询条件的对象
       SolrQuery params = new SolrQuery();
       //判断前台传递的关键字是否为空
       if(!"".equals(jingBean.getJingName()) && jingBean.getJingName()!=null ){
           //不为空设置条件为关键字
           params.set("q", jingBean.getJingName());
       }else if (!"".equals(jingBean.getJingTu()) && jingBean.getJingTu()!=null ){
           params.set("q", jingBean.getJingTu());
       }else if(!"".equals(jingBean.getJingJia()) && jingBean.getJingJia()!=null ){
           params.set("q", jingBean.getJingJia());
       }else if(!"".equals(jingBean.getJingJie()) && jingBean.getJingJie()!=null ) {
           params.set("q", jingBean.getJingJie());
       }  else{//如果为空查询所有
           params.set("q", "*:*");
       }
       //默认查询字段  一般默认指定
       params.set("df", "jingName");
       //指定查询结果返回哪些字段
       params.set("fl", "jingId,jingName,jingTu,jingJia,jingJie");
       // 设置高亮字段
       params.addHighlightField("jingName"); // 高亮字段
       //分页
       *//* if(page==null){
            params.setStart(0);
        }else {
            params.setStart((page-1)*rows);
        }
        if(rows==null){
            params.setRows(5);
        }else {
            params.setRows(rows);
        }*//*
       //高亮
       //打开开关
       params.setHighlight(true);
       //设置前缀
       params.setHighlightSimplePre("<div style='color:red'>");
       //设置后缀
       params.setHighlightSimplePost("</div>");
       //QueryResponse是查询返回的对象数据   client.query("core1",params)  查询的是哪个索引库和条件
       QueryResponse queryResponse = client.query("core1",params);
       ///查询返回的结果list对象   不包括高亮
       SolrDocumentList results = queryResponse.getResults();
       //查询出来总条数
       long numFound = results.getNumFound();
       //查询返回的高亮结果
       Map<String, Map<String, List<String>>> highlight = queryResponse.getHighlighting();
       //循环查询的所有结果
       for (SolrDocument result : results) {
           //创建对象接收循环的对象数据
           JingBean user1=new JingBean();
           //设置高亮的字段
           String highname="";
           //根据id获得高亮的内容
           Map<String, List<String>> map = highlight.get(result.get("jingId"));
           //根据高亮字段拿到数据
           List<String> list = map.get("jingName");
           //判断数据是否为空
           if(list==null){
               //如果为空把普通字段放到对象中
               highname=(String)result.get("jingName");
           }else{
               //获得高亮字段查询的值放到变量
               highname=list.get(0);
           }
           ;
           user1.setJingId(Integer.parseInt((String) result.get("jingId")));
           user1.setJingName(highname);
           user1.setJingTu((String) result.get("jingTu"));
           user1.setJingJie((String) result.get("jingJie"));
           user1.setJingJia((int)result.get("jingJia"));
           carList.add(user1);
       }
       mSolr.put("total",numFound);
       mSolr.put("rows",carList);
       System.out.println(mSolr);
       return carList;
   }*/

    //查询北京游玩信息
    @GetMapping("/user/queryBeiJing")
    public List<BeiBean> queryBeiJing(){
        List<BeiBean> list=new ArrayList<>();
        list = userservice.queryBeiJing();
        return list;
    }
    //查询旅游主题
    @GetMapping("/user/queryZhuTi")
    public List<ZhuTiBean> queryZhuTi(){
        List<ZhuTiBean> list = new ArrayList<>();
        list = userservice.queryZhuTi();
        return list;
    }
    //查询旅游出行时间
    @GetMapping("/user/queryShiJian")
    public List<ShiJianBean> queryShiJian(){
        List<ShiJianBean> list = new ArrayList<>();
        list = userservice.queryShiJian();
        return list;
    }
    //查询旅游目的地
    @GetMapping("/user/queryMuDi")
    public List<MuDiBean> queryMuDi(){
        List<MuDiBean> list = new ArrayList<>();
        list = userservice.queryMuDi();
        return list;
    }
    //查询景点详情
    @GetMapping("/user/queryJing")
    public List<XiangBean> queryJing(Integer jingId){
        List<XiangBean> list = new ArrayList<>();
        list = userservice.queryJing(jingId);
        System.out.println(list);
        System.out.println(jingId);
        return list;
    }
}
