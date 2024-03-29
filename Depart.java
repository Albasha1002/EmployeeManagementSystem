package com.management.user.VO;

import java.util.Objects;

import jakarta.persistence.Column;

public class Depart {
	
	private Long departmentId;
	
	private String departmentName;
	
	private String departmentAddress;
	
	private String departmentCode;

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentAddress() {
		return departmentAddress;
	}

	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	@Override
	public String toString() {
		return "Depart [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentAddress="
				+ departmentAddress + ", departmentCode=" + departmentCode + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(departmentAddress, departmentCode, departmentId, departmentName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Depart other = (Depart) obj;
		return Objects.equals(departmentAddress, other.departmentAddress)
				&& Objects.equals(departmentCode, other.departmentCode)
				&& Objects.equals(departmentId, other.departmentId)
				&& Objects.equals(departmentName, other.departmentName);
	}
	

}
