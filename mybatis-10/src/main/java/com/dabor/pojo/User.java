package com.dabor.pojo;

import javax.annotation.Generated;

public class User {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String pwd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public User(Integer id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public User() {
        super();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getName() {
        return name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPwd() {
        return pwd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }
}