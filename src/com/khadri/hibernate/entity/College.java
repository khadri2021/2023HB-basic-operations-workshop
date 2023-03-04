package com.khadri.hibernate.entity;

public class College {
	private Integer clgId;
	private String clgName;

	public Integer getClgId() {
		return clgId;
	}

	public void setClgId(Integer clgId) {
		this.clgId = clgId;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	@Override
	public String toString() {
		return "College [clgId=" + clgId + ", clgName=" + clgName + "]";
	}

}
