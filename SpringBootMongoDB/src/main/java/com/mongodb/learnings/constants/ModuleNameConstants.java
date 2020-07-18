package com.mongodb.learnings.constants;

public enum ModuleNameConstants {

	USER_CONFIGURATION("User Configuration"), ROLE_AND_PRIVILEGES("Role and Privileges"),
	SYSTEM_SETTINGS("System Settings"), REPORTS_DASHBOARD("Reports Dashboard"), AUDIT_TRIAL("Audit Trial"),
	GENERAL_PRIVILEGES("General Privileges");

	private String moduleNameDesc = null;

	private ModuleNameConstants(String desc) {
		this.moduleNameDesc = desc;
	}

	public String getModuleNameDesc() {
		return moduleNameDesc;
	}
}
