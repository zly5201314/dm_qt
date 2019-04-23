/**
 * Copyright (C), 2019, 金科教育
 * FileName: SchedualServiceHiHystric
 * Author:   zyl
 * Date:     2019/4/15 9:43
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.util;

import com.jk.model.*;
import com.jk.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author zyl
 * @create 2019/4/15
 * @since 1.0.0
 */
@Component
public class SchedualServiceHiHystric implements UserService {


    public String hiService(String name) {
        return "报错";
    }

    @Override
    public List<JingBean> queryTuPian() {
        return null;
    }

    @Override
    public List<ZhuTiBean> queryZhuTi() {
        return null;
    }

    @Override
    public List<ShiJianBean> queryShiJian() {
        return null;
    }

    @Override
    public List<MuDiBean> queryMuDi() {
        return null;
    }

    @Override
    public List<XiangBean> queryJing(Integer jingId) {
        return null;
    }

    @Override
    public List<BeiBean> queryBeiJing() {
        return null;
    }
}
