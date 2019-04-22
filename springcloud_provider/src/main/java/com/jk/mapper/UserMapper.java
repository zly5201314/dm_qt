package com.jk.mapper;

import com.jk.controller.*;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

/**
 * Package: com.jk.mapper
 * <p>
 * Description： TODO
 * <p>
 * Author: 闫占海
 * <p>
 * Date: Created in 2019/4/18 13:37
 * <p>
 * Company: 金科教育
 * <p>
 * Copyright: Copyright (c) 2017
 * <p>
 * Version: 0.0.1
 * <p>
 * Modified By:
 */
public interface UserMapper {



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
