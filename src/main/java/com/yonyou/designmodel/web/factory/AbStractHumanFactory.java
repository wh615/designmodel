package com.yonyou.designmodel.web.factory;

/**
 * @author: caowh
 * @Date: 2018/12/7 23:19
 * @Description:
 */
public abstract class AbStractHumanFactory {
    
    /**
     *
     * 功能描述: 
     * @param:
     * @return: 
     * @Auther: caowh
     * @date: 2018/12/7 23:20
     */
    public abstract <T extends Human> T creatHuman(Class<T> c);
}
