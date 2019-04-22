/**
 * Copyright (C), 2019, 1809B
 * FileName: UserMapper
 * Author:   要艳娜
 * Date:     2019/04/18 23:58
 * History:
 * <author>          <time>          <version>          <desc>
 * 要艳娜           修改时间           版本号              描述
 */
package com.jk.mapper;

import com.jk.controller.ChBean;
import com.jk.controller.HotelBean;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 *
 * @author yao
 * @create 2019/04/18
 * @since 1.0.0
 */

public interface UserMapper {

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


}

