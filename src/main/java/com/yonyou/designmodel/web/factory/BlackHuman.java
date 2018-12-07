package com.yonyou.designmodel.web.factory;

/**
 * @author: caowh
 * @Date: 2018/12/7 23:10
 * @Description:
 */
public class BlackHuman  implements  Human{
    @Override
    public String getColor() {
        return "黑种人";
    }

    @Override
    public String getSay() {
        return "黑种人说话";
    }
}
