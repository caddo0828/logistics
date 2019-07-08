package com.logistics.pojo;

public class DeptChild extends Dept{
	private String parentName;    //父部门部门名称
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
}
