package com.yuan.springboot.springboot_mybatis.entity;

import java.util.Date;

public class User {

    private long lId ;

    private String strLoginId ;

    private String strPassword ;

    private String strName ;

    private Date date ;

    public long getlId() {
        return lId;
    }

    public void setlId(long lId) {
        this.lId = lId;
    }

    public String getStrLoginId() {
        return strLoginId;
    }

    public void setStrLoginId(String strLoginId) {
        this.strLoginId = strLoginId;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
