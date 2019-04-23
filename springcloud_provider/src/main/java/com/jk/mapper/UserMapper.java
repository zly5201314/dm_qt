package com.jk.mapper;

import com.jk.controller.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.GetMapping;
import com.jk.controller.ChBean;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <pre>项目名称：dm_qt
 * 类名称：UserMapper
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/18 11:02
 * 修改人：张利瑶
 * 修改时间：2019/4/18 11:02
 * 修改备注：
 * @version </pre>
 */
public interface UserMapper {

    //查询博客
    @Select(value = " select * from zly_boke ")
    List<BokeBean> BokeList();

    //查询景点
    @Select(value = " select * from zly_jinDian ")
    List<JinBean> JinList();

    //查询酒店
    @Select(value = " select * from zly_jiudian ")
    List<JiuBean> JiuList();



    //查询酒店首页
    @Select(value = "select * from yyn_hotel ")
    List<HotelBean> queryHotelList();

    //查询北京
    @Select(value = "select * from yyn_hotel where dizhi LIKE '%北京%' ")
    List<HotelBean> querybeijing();

    //查询天津
    @Select(value = "select * from yyn_hotel where dizhi LIKE '%天津%' ")
    List<HotelBean> queryTianJin();

    //查询上海
    @Select(value = "select * from yyn_hotel where dizhi LIKE '%上海%' ")
    List<HotelBean> queryshanghai();

    //查询重庆
    @Select(value = "select * from yyn_hotel where dizhi LIKE '%重庆%' ")
    List<HotelBean> querychongqing();

    //查询杭州
    @Select(value = "select * from yyn_hotel where dizhi LIKE '%杭州%' ")
    List<HotelBean> queryhangzhou();

    //查询酒店房间
    int queryChCount(@Param("chBean")ChBean chBean);

    //查询酒店房间
    List<ChBean> queryChList(@Param("start")int start, @Param("rows")Integer rows,@Param("chBean")ChBean chBean);


    //预订房间
    @Select(value = " select * from  zly_chbean where id=#{shopId} ")
    ChBean findJiuById(Integer shopId);

    //立即预订
    void saveYu(ChBean chBean);


    /*登录*/
    @Select("SELECT * FROM user_lmd u WHERE u.userNumber = #{userNumber}")
    User login(String userNumber);

    /*注册*/
    @Insert("INSERT INTO user_lmd(userNumber,userPassword) VALUES(#{userNumber},#{userPassword})")
    void regStu(@Param("userNumber") String userNumber, @Param("userPassword")String userPassword);
    /*一日游页面*/
    @Select("SELECT * FROM user_lmd where userName is not null order by price")
    List<User> queryUserList();
    /*树页面*/
    @Select("select id,text,href,pid from tree_lmd n where pid=#{pid} ")
    List<Tree> findTreeById(@Param("pid")int pid);
    /*故宫页面*/
    @Select("SELECT * FROM user_lmd where userName='故宫'")
    List<User> queryGuGong();
    /*长城页面*/
    @Select("SELECT * FROM user_lmd where userName='长城'")
    List<User> queryChangCheng();
    /*欢乐谷页面*/
    @Select("SELECT * FROM user_lmd where userName='欢乐谷'")
    List<User> queryHuanLeGe();


    /* int queryCount(@Param("user") User user);*/


    /* List<User> queryUserList(@Param("start")int start, @Param("rows")Integer rows,@Param("user") User user);
     */
   /* @Select("select * from user_lmd where id=#{id}")
    List<User> queryUserById(@Param("id") Integer id);
*/


    //景点条查
    @Select(value = " select * from zly_jinDian where jinName=#{value} ")
    List<JinBean> tijiao(String jinName);

    @Select("select * from t_area")
    List<AreaBean> queryAreaList();
    @Select("select * from t_numberday")
    List<NumberDayBean> queryNumberDay();
    @Select("select * from t_name")
    List<NameBean> queryNameBean();

    List<ZhuTiBean> queryZhuTi();

    List<BeiJineBean> queryBeiJing();

    BeiJineBean findUserById(Integer id);


    void saveUser(YuFuBean userBean);
    @Select("select * from t_gouwuche")
    List<YuFuBean> queryGouWu();

    void delGouWu(Integer id);
}
