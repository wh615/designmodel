package com.yonyou.designmodel.web.singleton;

/**
 * @author: caowh
 * @Date: 2018/12/7 11:48
 * @Description:
 */
public class Person {


    private static  Person per=null;
    private Person(){

    }

    /**
     *
     * 功能描述: 
     * @return: 获取创建的实例对象
     * @Auther: caowh
     * @date: 2018/12/7 22:44
     */
    public static synchronized Person getInstance(){
        if (null!=per){
            return per;
        }else{
            per=new Person();
        }
        return per;
    }

    public void sayHello(){
        System.out.println("我是一个单例模式样例");
    }

    public static void main(String[] args) {
        Person instance1 = getInstance();
        Person instance2 = getInstance();
        instance1.sayHello();
        instance2.sayHello();

    }
}
