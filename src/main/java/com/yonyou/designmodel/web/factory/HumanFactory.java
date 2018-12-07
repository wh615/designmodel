package com.yonyou.designmodel.web.factory;

/**
 * @author: caowh
 * @Date: 2018/12/7 23:19
 * @Description:
 */
public  class HumanFactory extends AbStractHumanFactory{

    /**
     *
     * 功能描述: 
     * @param:
     * @return: 人类类型
     * @Auther: caowh
     * @date: 2018/12/7 23:27
     */
    @Override
    public <T extends Human> T creatHuman(Class<T> c) {
        Human hum=null;
        try {
            hum= (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误");
            e.printStackTrace();
        }
        return (T)hum;
    }

    public static void main(String[] args) {
        AbStractHumanFactory humanFactory = new HumanFactory();
        BlackHuman blackHuman = humanFactory.creatHuman(BlackHuman.class);
        YelloHuman yelloHuman = humanFactory.creatHuman(YelloHuman.class);
        WhiteHuman whiteHuman = humanFactory.creatHuman(WhiteHuman.class);
        System.out.println(blackHuman.getColor());
        System.out.println(yelloHuman.getColor());
        System.out.println(whiteHuman.getColor());
    }
}
