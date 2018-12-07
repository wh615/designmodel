package com.yonyou.designmodel.web.factory;

/**
 * @author: caowh
 * @Date: 2018/12/7 23:09
 * @Description:
 */
public class YelloHuman implements Human {

    @Override
    public String getColor() {
        return "黄棕人";
    }

    @Override
    public String getSay() {
        return "黄棕人说话";
    }
}
