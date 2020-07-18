package com.mongodb.learnings.constants;

public enum RoleNames {

	SYSTEM_ADMIN("System Admin"), COMPANY_ADMIN("Company Admin"), AGENT("Agent"), ANALYST("Analyst"),
	MANAGER("Manager"), FINANCE("Finance"), BASIC("Basic"), ROOT("Root"), SUPPORT("Support");

	private String roleNameDesc = null;
	private String groupId = null;

	private RoleNames(String desc) {
		this.roleNameDesc = desc;
	}

	public String getRoleNameDesc() {
		return roleNameDesc;
	}

	public String getGroupId() {
		return groupId;
	}
}
