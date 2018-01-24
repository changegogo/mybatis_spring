package com.feicui.po;

import java.util.Date;

public class TUser {
    private Integer uid;

    private String username;

    private String password;

    private Date time;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

	@Override
	public String toString() {
		return "TUser [uid=" + uid + ", username=" + username + ", password=" + password + ", time=" + time + "]";
	}
    
    
}