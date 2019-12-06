package com.crts.app.hm.main.model;


public class LoanType {
	
	private int loanTypeId;
	private String loanTypeName;
	private StatusMaster loanTypeStatus;

	public int getLoanTypeId() {
		return loanTypeId;
	}

	public void setLoanTypeId(int loanTypeId) {
		this.loanTypeId = loanTypeId;
	}

	public String getLoanTypeName() {
		return loanTypeName;
	}

	public void setLoanTypeName(String loanTypeName) {
		this.loanTypeName = loanTypeName;
	}

	public StatusMaster getLoanTypeStatus() {
		return loanTypeStatus;
	}

	public void setLoanTypeStatus(StatusMaster loanTypeStatus) {
		this.loanTypeStatus = loanTypeStatus;
	}

	@Override
	public String toString() {
		return "LoanType [loanTypeId=" + loanTypeId + ", loanTypeName=" + loanTypeName + ", loanTypeStatus="
				+ loanTypeStatus + "]";
	}

}
