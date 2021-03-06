package com.bw.wangqiqi.entity;

import java.sql.Date;

/**
 * @作者:王琪琪
 * @时间:2019年8月15日
 * 
 */
public class User {
  private int id;
  private String username;
  private String password;
  private String nickname;
  private Date birthday;
  private int gender;
  private boolean locked;
  private String  created;
  private String updated;
public int getId() {
	return id;
}
public void setId(int id) {
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
public String getNickname() {
	return nickname;
}
public void setNickname(String nickname) {
	this.nickname = nickname;
}
public Date getBirthday() {
	return birthday;
}
public void setBirthday(Date birthday) {
	this.birthday = birthday;
}
public int getGender() {
	return gender;
}
public void setGender(int gender) {
	this.gender = gender;
}
public boolean isLocked() {
	return locked;
}
public void setLocked(boolean locked) {
	this.locked = locked;
}
public String getCreated() {
	return created;
}
public void setCreated(String created) {
	this.created = created;
}
public String getUpdated() {
	return updated;
}
public void setUpdated(String updated) {
	this.updated = updated;
}
public User(int id, String username, String password, String nickname, Date birthday, int gender, boolean locked,
		String created, String updated) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.nickname = nickname;
	this.birthday = birthday;
	this.gender = gender;
	this.locked = locked;
	this.created = created;
	this.updated = updated;
}
@Override
public String toString() {
	return "user [id=" + id + ", username=" + username + ", password=" + password + ", nickname=" + nickname
			+ ", birthday=" + birthday + ", gender=" + gender + ", locked=" + locked + ", created=" + created
			+ ", updated=" + updated + "]";
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
  

}
