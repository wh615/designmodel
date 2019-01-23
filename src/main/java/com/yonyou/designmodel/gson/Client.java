package com.yonyou.designmodel.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.sun.deploy.security.SessionCertStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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



        //创建GSON第二种方式
        Map<String, String> map = new HashMap<String, String>();
        map.put("001","zhangsan");
        map.put("002","lisi");
        map.put("003","wangwu");
        GsonBuilder builder=new GsonBuilder();
        String toJson = builder.create().toJson(map);

        Map<String, List<User>> map1 = new HashMap<String, List<User>>();
        map1.put("001",usersList);
        String toJson1 = builder.create().toJson(map1);
        Map<List<User>, String> resultMap = gson.fromJson(toJson1,new TypeToken<Map<String,List<User>>>() {}.getType());
        System.out.println(toJson);
        System.out.println(toJson1);
        System.out.println(resultMap.toString());



    }
}
