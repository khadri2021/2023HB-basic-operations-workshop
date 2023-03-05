package com.khadri.hibernate.entity;

public class College {
	private Integer clgId;
	private String clgRegNumber;
	private String clgName;
	private Integer clgStrength;
	private String clgAddress;
	private String clgTown;
	private String clgCity;
	private String clgState;
	private Double clgAnnualReturns;
	private Integer clgOfficeStaff;
	private Integer clgTeachingStaff;

	public Integer getClgId() {
		return clgId;
	}

	public void setClgId(Integer clgId) {
		this.clgId = clgId;
	}

	public String getClgRegNumber() {
		return clgRegNumber;
	}

	public void setClgRegNumber(String clgRegNumber) {
		this.clgRegNumber = clgRegNumber;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	public Integer getClgStrength() {
		return clgStrength;
	}

	public void setClgStrength(Integer clgStrength) {
		this.clgStrength = clgStrength;
	}

	public String getClgAddress() {
		return clgAddress;
	}

	public void setClgAddress(String clgAddress) {
		this.clgAddress = clgAddress;
	}

	public String getClgTown() {
		return clgTown;
	}

	public void setClgTown(String clgTown) {
		this.clgTown = clgTown;
	}

	public String getClgCity() {
		return clgCity;
	}

	public void setClgCity(String clgCity) {
		this.clgCity = clgCity;
	}

	public String getClgState() {
		return clgState;
	}

	public void setClgState(String clgState) {
		this.clgState = clgState;
	}

	public Double getClgAnnualReturns() {
		return clgAnnualReturns;
	}

	public void setClgAnnualReturns(Double clgAnnualReturns) {
		this.clgAnnualReturns = clgAnnualReturns;
	}

	public Integer getClgOfficeStaff() {
		return clgOfficeStaff;
	}

	public void setClgOfficeStaff(Integer clgOfficeStaff) {
		this.clgOfficeStaff = clgOfficeStaff;
	}

	public Integer getClgTeachingStaff() {
		return clgTeachingStaff;
	}

	public void setClgTeachingStaff(Integer clgTeachingStaff) {
		this.clgTeachingStaff = clgTeachingStaff;
	}

	@Override
	public String toString() {
		return "College [clgId=" + clgId + ", clgRegNumber=" + clgRegNumber + ", clgName=" + clgName + ", clgStrength="
				+ clgStrength + ", clgAddress=" + clgAddress + ", clgTown=" + clgTown + ", clgCity=" + clgCity
				+ ", clgState=" + clgState + ", clgAnnualReturns=" + clgAnnualReturns + ", clgOfficeStaff="
				+ clgOfficeStaff + ", clgTeachingStaff=" + clgTeachingStaff + "]";
	}
}
