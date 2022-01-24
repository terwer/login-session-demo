package com.terwergreen.pojo;

/**
 * 用户pojo
 *
 * @name: User
 * @author: terwer
 * @date: 2022-01-24 21:40
 **/
public class User {
    private Integer id;
    private String username;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
