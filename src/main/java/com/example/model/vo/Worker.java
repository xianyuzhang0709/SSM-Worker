package com.example.model.vo;

public class Worker {
    private Integer wid;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "Worker{" +
                "wid=" + wid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
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

    public Worker(Integer wid, String username, String password) {
        this.wid = wid;
        this.username = username;
        this.password = password;
    }

    public Worker() {
    }
}
