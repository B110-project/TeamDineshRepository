package com.crts.app.hm.main.model;


public class BranchType {
	

	private int branchTypeId;;
	private String regional;
	private String headOffice;
	private StatusMaster branchTypeStatus;

	public int getBranchTypeId() {
		return branchTypeId;
	}

	public void setBranchTypeId(int branchTypeId) {
		this.branchTypeId = branchTypeId;
	}

	public String getRegional() {
		return regional;
	}

	public void setRegional(String regional) {
		this.regional = regional;
	}

	public String getHeadOffice() {
		return headOffice;
	}

	public void setHeadOffice(String headOffice) {
		this.headOffice = headOffice;
	}

	public StatusMaster getBranchTypeStatus() {
		return branchTypeStatus;
	}

	public void setBranchTypeStatus(StatusMaster branchTypeStatus) {
		this.branchTypeStatus = branchTypeStatus;
	}

	@Override
	public String toString() {
		return "BranchType [branchTypeId=" + branchTypeId + ", regional=" + regional + ", headOffice=" + headOffice
				+ ", branchTypeStatus=" + branchTypeStatus + "]";
	}

}
