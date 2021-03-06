package com.crts.app.hm.main.model;


public class User {
	
	private int userId;
	private String username;
	private String password;
	private Role userRole;
	private String branchCode;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public Role getUserRole() {
		return userRole;
	}

	public void setUserRole(Role userRole) {
		this.userRole = userRole;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", userRole=" + userRole
				+ ", branchCode=" + branchCode + "]";
	}

}
