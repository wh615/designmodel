package com.yonyou.designmodel.gson;

/**
 * @Description:
 * @author: caowh
 * @Date: 2019/1/23 22:40
 * version 1.0
 */
public class Info {

    private String id;
    private String nike;
    private String ts;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNike() {
        return nike;
    }

    public void setNike(String nike) {
        this.nike = nike;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    @Override
    public String toString() {
        return "Info{" +
                "id='" + id + '\'' +
                ", nike='" + nike + '\'' +
                ", ts='" + ts + '\'' +
                '}';
    }
}
