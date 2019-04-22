package com.jk.mapper;

import com.jk.controller.BokeBean;
import com.jk.controller.ChBean;
import com.jk.controller.JinBean;
import com.jk.controller.JiuBean;
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


    int queryChCount(@Param("chBean")ChBean chBean);

    //房间
    List<ChBean> queryChList(@Param("start")int start,@Param("rows") Integer rows,@Param("chBean") ChBean chBean);

    //预订房间
    @Select(value = " select * from  zly_chbean where id=#{shopId} ")
    ChBean findJiuById(Integer shopId);

    //立即预订
    void saveYu(ChBean chBean);

    //景点条查
    @Select(value = " select * from zly_jinDian where jinName=#{value} ")
    List<JinBean> tijiao(String jinName);
}
