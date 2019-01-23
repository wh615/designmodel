package com.yonyou.designmodel.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: caowh
 * @Date: 2019/1/23 22:25
 * version 1.0
 */
public class Client {
    public static void main(String[] args){

        Info info = new Info();
        info.setId("001");
        info.setNike("王五");
        info.setTs("2019-01-23");

        User user = new User();
        user.setAddress("广州市白云区白水塘");
        user.setAge(20);
        user.setId("100");
        user.setName("zhangsan");
        user.setPassword("123qwe");
        user.setInfo(info);

        ArrayList<User> usersList = new ArrayList<>();
        usersList.add(user);
        Gson gson=new Gson();
        //bean对象转换成json对象
        String json = gson.toJson(user);
        //list集合对象转换成json对象
        String listjson = gson.toJson(usersList);
        //json转换成bean对象
        User user1 = gson.fromJson(json, User.class);
        //json转换成集合对象
        List<User> retList = gson.fromJson(listjson,new TypeToken<List<User>>(){}.getType());

        System.out.println(json);
        System.out.println(user1.getAddress()+user1.getName());
        System.out.println(listjson);
        System.out.println(retList.get(0).toString());
    }
}
