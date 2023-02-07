package com.management.user.VO;

import java.util.Objects;

import com.management.user.entity.User;

public class ResponseTemplateVO {
	
	
	private User user;
	private Depart department;
	
	
	public ResponseTemplateVO() {
		super();
		this.user = user;
		this.department = department;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Depart getDepartment() {
		return department;
	}
	public void setDepartment(Depart department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "ResponseTemplateVO [user=" + user + ", department=" + department + ", getUser()=" + getUser()
				+ ", getDepartment()=" + getDepartment() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(department, user);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponseTemplateVO other = (ResponseTemplateVO) obj;
		return Objects.equals(department, other.department) && Objects.equals(user, other.user);
	}

}
