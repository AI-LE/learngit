package com.hehevideo.model;

import java.time.LocalDate;



/** @version: 
* @Description: 
* userId 	用户ID
* userName	用户名
* pwd		密码	
* tel		电话
* gender	性别性别（1表示男，0表示女）
* birthDay	生日
* status	状态标识（1表示账号有效，0表示账号已注销）
* isAdmin	管理员标识（1表示管理员账号，0表示普通用户）
* createTime用户创建时间
* @author: wx
* @date: 2019/04/02
*/ 
public class User {
	private int userId;	
	private String userName;
	private String pwd;
	private String tel;
	private int gender;
	private String birthDay;
	private int status;
	private int isAdmin;
	private LocalDate createTime;

	public User(String userName, String pwd, String tel, int gender,
			String birthDay, int status, int isAdmin,
			LocalDate createTime) {
		super();
		this.userName = userName;
		this.pwd = pwd;
		this.tel = tel;
		this.gender = gender;
		this.birthDay = birthDay;
		this.status = status;
		this.isAdmin = isAdmin;
		this.createTime = createTime;
	}

	public User(String userName, String pwd) {
		super();
		this.userName = userName;
		this.pwd = pwd;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int isGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public int isStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int isAdmin() {
		return isAdmin;
	}
	public void setAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	public LocalDate getCreateTime() {
		return createTime;
	}
	public void setCreateTime(LocalDate createTime) {
		this.createTime = createTime;
	}
}
