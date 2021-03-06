package com.crts.app.hm.main.model;




public class Role {
	

	private int roleId;
	private String roleName;
	private StatusMaster roleStatus;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public StatusMaster getRoleStatus() {
		return roleStatus;
	}

	public void setRoleStatus(StatusMaster roleStatus) {
		this.roleStatus = roleStatus;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", roleStatus=" + roleStatus + "]";
	}

}
