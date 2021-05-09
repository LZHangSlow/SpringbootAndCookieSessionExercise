package com.lzh.bean;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;



public class User {
	private Integer userId;

    private String username;

    private List<Address> addresses;


    private Calendar created = new GregorianCalendar();


    public User(Integer userId,String username){
        this.userId=userId;
        this.username=username;
    }
    public User(Integer userId,String username,List<Address> addresses){
        this.userId=userId;
        this.username=username;
        this.addresses=addresses;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Calendar getCreated() {
        return created;
    }

    public void setCreated(Calendar created) {
        this.created = created;
    }
}
