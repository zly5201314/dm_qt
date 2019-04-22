package com.jk.service;

import com.jk.controller.ChBean;
import com.jk.controller.HotelBean;
import com.jk.controller.Tree;
import com.jk.controller.User;
import com.jk.mapper.UserMapper;
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
    private UserMapper usermapper;

    @GetMapping(value = "/hi")
    @ResponseBody
    public String hiService(String name)     {
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

    /*登录*/
    @GetMapping(value="/login")
    @ResponseBody
    public String login(@RequestParam("userNumber") String userNumber,@RequestParam("userPassword")String userPassword) {
        User user= usermapper.login(userNumber);

        if(user==null){

            return "3";
        }
        String password=userPassword;
        if(!user.getUserPassword().equals(password)){

            return "2";
        }
        return "1";
    }



    /*注册*/
    @RequestMapping(value="/regStu",method = RequestMethod.POST)
    @ResponseBody
    public String regStu(@RequestParam("userNumber") String userNumber,@RequestParam("userPassword")String userPassword) {
        usermapper.regStu(userNumber,userPassword);
        return "注册成功";
    }

    /*一日游页面*/
    @GetMapping(value="/queryUserList")
    @ResponseBody
    public List<User> queryUserList(){
        List<User> users = usermapper.queryUserList();
        System.out.println(users);
        return users;

    }
    /*树页面*/
    @GetMapping(value="/getTree")
    @ResponseBody
    public List<Tree> getTree() {
        int pid=0;
        List<Tree> list = findnode(pid);
        return list;
    }

    private List<Tree> findnode(@RequestParam("pid")int pid) {
        List<Tree> list=usermapper.findTreeById(pid);

        for (Tree tree : list) {
            Integer id = tree.getId();
            List<Tree> node=findnode(id);

            if(node.size()<=0){
                //没有节点的话可以点
                tree.setSelectable(true);
            }else{
                tree.setSelectable(false);
                tree.setNodes(node);
            }


        }
        System.out.println(list);
        return list;

    }

    /*故宫页面*/
    @GetMapping(value="/queryGuGong")
    @ResponseBody
    public List<User> queryGuGong(){
        return usermapper.queryGuGong();
    }
    /*长城页面*/
    @GetMapping(value="/queryChangCheng")
    @ResponseBody
    public List<User> queryChangCheng(){
        return usermapper.queryChangCheng();
    }
    /*欢乐谷页面*/
    @GetMapping(value="/queryHuanLeGe")
    @ResponseBody
    public List<User> queryHuanLeGe(){
        return usermapper.queryHuanLeGe();
    }

    //查询博客
    @GetMapping(value = "/boke/BokeList")
    @ResponseBody
    public List<BokeBean> BokeList(){
        List<BokeBean> list=usermapper.BokeList();
        System.out.println(list);
        return list;
    }

    //查询首页
    @GetMapping(value = "/Jin/JinList")
    @ResponseBody
    public List<JinBean> JinList(){
        List<JinBean> list=usermapper.JinList();
        System.out.println(list);
        return list;
    }


    //查询首页酒店
    @GetMapping("/jiu/JiuList")
    @ResponseBody
    public  List<JiuBean> JiuList(){
        List<JiuBean> list=usermapper.JiuList();
        System.out.println(list);
        return list;
    }



    //景点条查
    @GetMapping("/jin/tijiao")
    @ResponseBody
    public List<JinBean> tijiao(@RequestParam("jinName")String jinName){
        List<JinBean> list=usermapper.tijiao(jinName);
        return list;
    };


}
