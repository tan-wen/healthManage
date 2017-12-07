package com.aoyang.health.admin.entity;

import java.util.Date;

import com.aoyang.health.admin.util.JsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class User extends BaseEntity{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String password;
	
	@JsonSerialize(using=JsonDateSerializer.class)
	private Date birthday;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", birthday=" + birthday + "]";
	}

}
